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
		<div class="sub_titulo">✠ LISTA DE PRODUCTOS</div>
		<div class="contenido">
		<div id="cabezera">Codigo | Nombre | Precio Unit. Compra | Precio Unit. Venta | Stock </div>
			<ul>
			<%
			if (productos.size() != 0) {
				for(Producto p: productos) {
			%>
					<div class="label">
					<li><% out.println(p.getCodigo() + "\t|" + p.getNombre() + "\t|" +
					p.getPrecio_unitario_compra() + "\t|" + p.getPrecio_unitario_venta() + "\t|" +
					p.getStock() + "|"); %></li>
					</div>
			<%					
				}
			} else {
				%>
				<div class="label">NO EXISTE PRODUCTOS</div>
			<%						
			}
			%>
			</ul>
		</div>
	</div>
</body>
</html>