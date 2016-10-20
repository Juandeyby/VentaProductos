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
		<div class="sub_titulo">✠ LISTA DE USUARIOS</div>
		<div id="contenedor">
			<div class="contenidos">
        		<div class="columna">Usuario</div>
        		<div class="columna">Nombres</div>
        		<div class="columna">Apellidos</div>
        		<div class="columna">DNI</div>
    		</div>
			<%
			if (personas.size() != 0) {
				for(Persona p: personas) {
			%>
		    <div class="contenidos">
        		<div class="columna"><% out.println(p.getUsuario());%></div>
        		<div class="columna"><% out.println(p.getNombres());%></div>
        		<div class="columna"><% out.println(p.getApellidos());%></div>
        		<div class="columna"><% out.println(p.getDni());%></div>
    		</div>
    		<%					
				}
			} else {
				%>
				<div class="label">NO EXISTE USUARIOS</div>
			<%						
			}
			%>
		</div>
	</div>
</body>
</html>