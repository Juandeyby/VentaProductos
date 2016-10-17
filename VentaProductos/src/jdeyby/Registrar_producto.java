package jdeyby;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@SuppressWarnings("serial")
public class Registrar_producto extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		RequestDispatcher redirigir;
		String codigo = req.getParameter("codigo");
		String nombre = req.getParameter("nombre");
		String precio_unitario_compra = req.getParameter("precio_unitario_compra");
		String precio_unitario_venta = req.getParameter("precio_unitario_venta");
		String stock = req.getParameter("stock");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Producto.class);
		
		Producto per = new Producto(codigo, nombre, precio_unitario_compra, precio_unitario_venta, stock);
		q.setFilter("codigo == codigoParam");
		q.declareParameters("String codigoParam");
		
		List<Producto> productos = (List<Producto>) q.execute(codigo);
		if(productos == null || productos.size() != 0){
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error_producto_existente.jsp");
		}
		else {
			pm.makePersistent(per);
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/exito_registro.jsp");
		}
		pm.close();
		try {
			redirigir.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}
