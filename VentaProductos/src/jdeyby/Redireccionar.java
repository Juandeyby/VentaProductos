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
		case "admin_user_registrar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_user_registrar.jsp");
			break;
			
		case "admin_user_lista":
			Query q = pm.newQuery(Persona.class);
			@SuppressWarnings("unchecked")
			List<Persona> personas = (List<Persona>) q.execute();
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
			
		default:
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error_no_disponible.jsp");
			break;
		}
		redirigir.forward(req, resp);
	}
}
