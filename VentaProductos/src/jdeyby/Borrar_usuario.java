package jdeyby;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@SuppressWarnings("serial")
public class Borrar_usuario extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		RequestDispatcher redirigir;
		String usuario = req.getParameter("usuario");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Persona.class);

		q.setFilter("usuario == usuarioParam");
		q.declareParameters("String usuarioParam");
		
		List<Persona> personas = (List<Persona>) q.execute(usuario);
		if(personas == null || personas.size() != 0){
			pm.deletePersistent(personas.get(0));
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/exito_borrar.jsp");
		}
		else {
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error_usuario_no_existente.jsp");
		}
		pm.close();
		try {
			redirigir.forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}
