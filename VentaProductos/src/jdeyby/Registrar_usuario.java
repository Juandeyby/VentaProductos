package jdeyby;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@SuppressWarnings("serial")
public class Registrar_usuario extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		RequestDispatcher redirigir;
		String nombres = req.getParameter("nombres");
		String apellidos = req.getParameter("apellidos");
		String dni = req.getParameter("dni");
		String usuario = req.getParameter("usuario");
		String contrasena = req.getParameter("contrasena");
		
		System.out.println(dni);
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Persona.class);
		
		Persona per = new Persona(usuario, contrasena, nombres, apellidos, dni, false);
		System.out.println(per);
		q.setFilter("usuario == usuarioParam");
		q.declareParameters("String usuarioParam");
		
		List<Persona> personas = (List<Persona>) q.execute(usuario);
		if(personas != null || personas.size() != 0){
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error_usuario_existente.jsp");
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
