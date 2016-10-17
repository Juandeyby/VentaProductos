<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jdeyby.*"%>
<%@ page import="java.util.*;"%>
<%
	List<Persona> personas = (List<Persona>) request.getAttribute("personas");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Lista</title>
    <link rel="stylesheet" type="text/css" href="/css/third.css">
    <script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/js/first.js"></script>
</head>
<body>
	<div class="sub_principal">
		<div class="sub_titulo">✠ LISTA DE USUARIO</div>
		<div id="lista_usuario">
		<div id="cabezera">Usuario | Nombres | Apellidos | DNI</div>
			<ul>
			<%
			if (personas.size() != 0) {
				for(Persona p: personas) {
			%>
					<div class="label">
					<li><% out.println(p.getUsuario() + "\t|" + p.getNombres() + "\t|" + p.getApellidos() + "\t|" + p.getDni() + "|"); %></li>
					</div>
			<%					
				}
			} else {
				%>
				<div class="label">NO EXISTE USUARIOS</div>
			<%						
			}
			%>
			</ul>
		</div>
	</div>
</body>
</html>