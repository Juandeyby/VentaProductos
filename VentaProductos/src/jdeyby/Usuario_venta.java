package jdeyby;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@SuppressWarnings("serial")
public class Usuario_venta extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		RequestDispatcher redirigir = null;
		
		String codigo = req.getParameter("codigo");
		int cantidad = Integer.parseInt(req.getParameter("cantidad"));
		
		
		HttpSession session = req.getSession();
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Producto.class);
		q.setFilter("codigo == codigoParam");
		q.declareParameters("String codigoParam");
		
		List<Producto> productos = (List<Producto>) q.execute(codigo);
		if (productos.size() != 0) {
			productos.get(0).setStock(productos.get(0).getStock() - cantidad);

			Venta ven = new Venta((String) session.getAttribute("session"), productos.get(0).getNombre(),
					productos.get(0).getCodigo(), cantidad);
			System.out.println(ven.toString());
			pm.makePersistent(ven);
			pm.close();
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/exito.jsp");
		}
		redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error.jsp");
		try {
			redirigir.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}
