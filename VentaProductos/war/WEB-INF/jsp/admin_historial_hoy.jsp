<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jdeyby.*"%>
<%@ page import="java.util.*;"%>
<%
	List<Venta> ventas = (List<Venta>) request.getAttribute("ventas");
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
		<div class="sub_titulo">✠ LISTA DE VENTAS</div>
		<div id="contenedor">
			<div class="contenidos">
        		<div class="columna">Usuario</div>
        		<div class="columna">Producto</div>
        		<div class="columna">Codigo Producto</div>
        		<div class="columna">Cantidad</div>
        		<div class="columna">Fecha</div>
    		</div>
			<%
			if (ventas.size() != 0) {
				for(Venta p: ventas) {
			%>
		    <div class="contenidos">
        		<div class="columna"><% out.println(p.getUsuario());%></div>
        		<div class="columna"><% out.println(p.getProducto());%></div>
        		<div class="columna"><% out.println(p.getCodigo_producto());%></div>
        		<div class="columna"><% out.println(p.getCantidad());%></div>
        		<div class="columna"><% out.println(p.getFecha());%></div>
    		</div>
    		<%					
				}
			} else {
				%>
				<div class="label">NO EXISTE HISTORIAL</div>
			<%						
			}
			%>
		</div>
	</div>
</body>
</html>