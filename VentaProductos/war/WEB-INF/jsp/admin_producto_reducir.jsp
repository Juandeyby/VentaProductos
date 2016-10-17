<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Modificar</title>
    <link rel="stylesheet" type="text/css" href="/css/third.css">
    <script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/js/first.js"></script>
</head>
<body>
	<div class="sub_principal">
		<div class="sub_titulo">✠ REDUCIR STOCK DE PRODUCTOS</div>
		<div class="contenido">
			<div class="label">CODIGO *requerido</div>
			<input class="caja" name="codigo" type="text">
			<div class="label">---------------------------------------</div>
			<div class="label">REDUCIR EN</div>
			<input class="caja" name="stock" type="text"><br>
			<div class="boton" id="reducir_producto_accion">REDUCIR CANTIDAD</div>
		</div>
	</div>
</body>
</html>