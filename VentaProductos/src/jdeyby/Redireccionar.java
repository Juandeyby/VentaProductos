package jdeyby;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Redireccionar extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		RequestDispatcher redirigir;
		String redireccionar = req.getParameter("redireccionar");
		
		switch (redireccionar) {
		case "admin_user_registrar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_user_registrar.jsp");
			break;
			
		case "admin_user_modificar":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_user_modificar.jsp");
			break;
			
		default:
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error_no_disponible.jsp");
			break;
		}
		redirigir.forward(req, resp);
	}
}
