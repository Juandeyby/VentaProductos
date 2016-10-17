package jdeyby;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Redireccionar extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		RequestDispatcher redirigir;
		HttpSession sesion = req.getSession();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		String redireccionar = req.getParameter("redireccionar");
		
		switch (redireccionar) {
		
		case "admin_admin_modificar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_admin_modificar.jsp");
			break;
		
		case "admin_user_registrar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_user_registrar.jsp");
			break;
			
		case "admin_user_lista":
			Query q1 = pm.newQuery(Persona.class);
			@SuppressWarnings("unchecked")
			List<Persona> personas = (List<Persona>) q1.execute();
			req.setAttribute("personas", personas);
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_user_lista.jsp");
			break;
			
		case "admin_user_modificar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_user_modificar.jsp");
			break;
		
		case "admin_user_borrar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_user_borrar.jsp");
			break;
			
		case "admin_producto_registrar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_producto_registrar.jsp");
			break;
			
		case "admin_producto_lista":
			Query q2 = pm.newQuery(Producto.class);
			@SuppressWarnings("unchecked")
			List<Producto> productos = (List<Producto>) q2.execute();
			req.setAttribute("productos", productos);
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_producto_lista.jsp");
			break;
			
		case "admin_producto_borrar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_producto_borrar.jsp");
			break;
		
		case "admin_producto_aumentar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_producto_aumentar.jsp");
			break;
			
		case "admin_producto_reducir":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_producto_reducir.jsp");
			break;
			
		default:
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error_no_disponible.jsp");
			break;
		}
		redirigir.forward(req, resp);
	}
}
