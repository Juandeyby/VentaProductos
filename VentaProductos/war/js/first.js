/**
 * Author Juandeyby
 */

$(document).ready(function() {
	$('#admin_user_registrar').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_user_registrar'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	$('#admin_user_modificar').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_user_modificar'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#admin_user_borrar').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_user_borrar'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#registrar_usuario_accion').click(function() {
		$.ajax({
			type: 'post',
			url : 'registrar_usuario',
			data : {
				nombres : $('input:text[name=nombres]').val(),
				apellidos : $('input:text[name=apellidos]').val(),
				dni : $('input:text[name=dni]').val(),
				usuario : $('input:text[name=usuario]').val(),
				contrasena : $('input:password[name=contrasena]').val()
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
});


