package jdeyby;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@SuppressWarnings("serial")
public class Borrar_producto extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		RequestDispatcher redirigir;
		String codigo = req.getParameter("codigo");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Producto.class);

		q.setFilter("codigo == codigoParam");
		q.declareParameters("String codigoParam");
		
		List<Producto> productos = (List<Producto>) q.execute(codigo);
		if(productos.size() != 0){
			pm.deletePersistent(productos.get(0));
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/exito_borrar.jsp");
		}
		else {
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error_producto_no_existente.jsp");
		}
		pm.close();
		try {
			redirigir.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}
