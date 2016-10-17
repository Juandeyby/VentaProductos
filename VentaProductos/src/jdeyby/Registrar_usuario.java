package jdeyby;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Registrar_usuario extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		RequestDispatcher redirigir;
		String nombres = req.getParameter("nombres");
		String apellidos = req.getParameter("apellidos");
		String dni = req.getParameter("dni");
		String usuario = req.getParameter("usuario");
		String contrasena = req.getParameter("contrasena");
		
		System.out.println(nombres + apellidos + dni + usuario + contrasena);
		
		if (nombres.equals("admin") && contrasena.equals("admin")) {
//			HttpSession sesion = req.getSession();
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/pag_admin.jsp");
		} else {
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		}
		redirigir.forward(req, resp);
		
//		PersistenceManager pm = PMF.get().getPersistenceManager();
//		Query q = pm.newQuery(Persona.class);
	}
}
