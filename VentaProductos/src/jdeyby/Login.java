package jdeyby;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Login extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		RequestDispatcher redirigir;
		String usuario = req.getParameter("usuario");
		String contrasena = req.getParameter("contrasena");
		
		if (usuario.equals("admin") && contrasena.equals("admin")) {
//			HttpSession sesion = req.getSession();
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		} else {
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		}
		redirigir.forward(req, resp);
		
//		PersistenceManager pm = PMF.get().getPersistenceManager();
//		Query q = pm.newQuery(Persona.class);
	}
}
