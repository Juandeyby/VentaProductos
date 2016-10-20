package jdeyby;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Login extends HttpServlet {
	static String contrasenabase = "admin";
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
			
			PersistenceManager pm = PMF.get().getPersistenceManager();
			Query q = pm.newQuery(Persona.class);
			
			if (usuario.equals("admin") && contrasena.equals(contrasenabase)) {
				redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/pag_admin.jsp");
			} else {
				q.setFilter("usuario == usuarioParam");
				q.declareParameters("String usuarioParam");
				List<Persona> personas = (List<Persona>) q.execute(usuario);
				if (personas.size() != 0) {
					HttpSession session = req.getSession();
					session.setAttribute("session", personas.get(0).getUsuario());
					redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/pag_usuario.jsp");
				} else {
				redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp");
				}
			}
		}
		redirigir.forward(req, resp);
		
//		PersistenceManager pm = PMF.get().getPersistenceManager();
//		Query q = pm.newQuery(Persona.class);
	}
}
