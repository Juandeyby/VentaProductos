<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jdeyby.*"%>
<%@ page import="java.util.*;"%>
<%
	List<Producto> productos = (List<Producto>) request.getAttribute("productos");
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
		<div class="sub_titulo">✠ LISTA DE STOCK</div>
		<div id="contenedor">
			<div class="contenidos">
        		<div class="columna">Codigo</div>
        		<div class="columna">Nombre</div>
        		<div class="columna">Precio Unit. Venta</div>
        		<div class="columna">Stock</div>
    		</div>
			<%
			if (productos.size() != 0) {
				for(Producto p: productos) {
			%>
		    <div class="contenidos">
        		<div class="columna"><% out.println(p.getCodigo());%></div>
        		<div class="columna"><% out.println(p.getNombre());%></div>
        		<div class="columna"><% out.println(p.getPrecio_unitario_venta());%></div>
        		<div class="columna"><% out.println(p.getStock());%></div>
    		</div>
    		<%					
				}
			} else {
				%>
				<div class="label">NO EXISTE PRODUCTOS</div>
			<%						
			}
			%>
		</div>
	</div>
</body>
</html>