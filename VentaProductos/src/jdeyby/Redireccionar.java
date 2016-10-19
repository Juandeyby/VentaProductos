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
	
	static Double caja = 0.0;
	
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
			
		case "usuario_caja_ver":
			req.setAttribute("caja", caja);
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/usuario_caja_ver.jsp");
			break;
			
		case "usuario_stock_ver":
			Query q3 = pm.newQuery(Producto.class);
			@SuppressWarnings("unchecked")
			List<Producto> productos1 = (List<Producto>) q3.execute();
			req.setAttribute("productos", productos1);
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/usuario_stock_ver.jsp");
			break;
			
		case "usuario_venta":
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/usuario_venta.jsp");
			break;
			
		case "admin_historial":
			Query q4 = pm.newQuery(Venta.class);
			@SuppressWarnings("unchecked")
			List<Venta> ventas = (List<Venta>) q4.execute();
			req.setAttribute("ventas", ventas);
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/admin_historial.jsp");
			break;
			
		case "cerrar":
			sesion = req.getSession(false);
	        sesion.setAttribute("email", null);
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp");
			break;
			
		default:
			redirigir = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error_no_disponible.jsp");
			break;
		}
		redirigir.forward(req, resp);
	}
}
