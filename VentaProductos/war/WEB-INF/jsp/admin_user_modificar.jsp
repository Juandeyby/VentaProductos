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
		<div class="sub_titulo">✠ MODIFICAR USUARIO</div>
		<div id="modificar_usuario">
			<div class="label">DNI</div>
			<input class="caja" id="dni" type="number">
			<div class="label">---------------------------------------</div>
			<div class="label">NOMBRES</div>
			<input class="caja" id="nombres" type="text">
			<div class="label">APELLIDOS</div>
			<input class="caja" id="apellidos" type="text">
			<div class="label">CONTRASEÑA</div>
			<input class="caja" id="contrasena" type="password"><br>
			<button id="modificar_usuario_accion">MODIFICAR USUARIO</button>
		</div>
	</div>
</body>
</html>