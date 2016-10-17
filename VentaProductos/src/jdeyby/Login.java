package jdeyby;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Login extends HttpServlet {
	String contrasenabase = "admin";
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		RequestDispatcher redirigir;
		if(req.getParameter("cambio") != null && req.getParameter("cambio").equals("true")) {
			if(req.getParameter("contrasena1").equals(contrasenabase)) {
				contrasenabase = req.getParameter("contrasena2");
				redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/exito.jsp");
			}
			else {
				redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error.jsp");
			}
		} else {
			String usuario = req.getParameter("usuario");
			String contrasena = req.getParameter("contrasena");
			
			if (usuario.equals("admin") && contrasena.equals(contrasenabase)) {
				redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/pag_admin.jsp");
			} else {
				redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp");
			}
		}
		redirigir.forward(req, resp);
		
//		PersistenceManager pm = PMF.get().getPersistenceManager();
//		Query q = pm.newQuery(Persona.class);
	}
}
