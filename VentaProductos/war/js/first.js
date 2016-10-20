/**
 * Author Juandeyby
 */

$(document).ready(function() {
	
	$('#cerrar').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'cerrar'
			},
			success : function(responseText) {
				$('#supersuper').html(responseText);
			}
		});
	});
	
	$('#admin_admin_modificar').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_admin_modificar'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
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
	
	$('#admin_user_lista').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_user_lista'
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
	
	$('#admin_producto_registrar').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_producto_registrar'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#admin_producto_lista').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_producto_lista'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#admin_producto_borrar').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_producto_borrar'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#admin_producto_aumentar').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_producto_aumentar'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#admin_producto_reducir').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_producto_reducir'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#admin_historial').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_historial'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#admin_historial_hoy').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'admin_historial_hoy'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#registrar_usuario_accion').click(function() {
		if ($('input:text[name=dni]').val().match(/^[0-9]{8}$/)
				&& $('input:text[name=usuario]').val().match(/^[a-z0-9_-]{3,16}$/)
				&& $('input:password[name=contrasena]').val().match(/^.+$/)) {
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
				beforeSend: function() {
				    $('#principal').html('<img id="cargar" alt="cargar" src="image/cargar.gif">');
				},
				success : function(responseText) {
					$('#principal').html(responseText);
				}
			});
		} else {
			alert("Datos Incorrectos Ingresados");
		}
	});
	
	$('#modificar_usuario_accion').click(function() {
		if ($('input:text[name=usuario]').val().match(/^[a-z0-9_-]{3,16}$/)
				&& $('input:text[name=contrasena]').val().match(/^.+$/)) {
			$.ajax({
				type: 'post',
				url : 'modificar_usuario',
				data : {
					usuario : $('input:text[name=usuario]').val(),
					contrasena : $('input:password[name=contrasena]').val()
				},
				beforeSend: function() {
				    $('#principal').html('<img id="cargar" alt="cargar" src="image/cargar.gif">');
				},
				success : function(responseText) {
					$('#principal').html(responseText);
				}
			});
		} else {
			alert("Datos Incorrectos Ingresados");
		}
	});
	
	$('#borrar_usuario_accion').click(function() {
		if ($('input:text[name=usuario]').val().match(/^[a-z0-9_-]{3,16}$/)) {
			$.ajax({
				type: 'post',
				url : 'borrar_usuario',
				data : {
					usuario : $('input:text[name=usuario]').val(),
				},
				beforeSend: function() {
				    $('#principal').html('<img id="cargar" alt="cargar" src="image/cargar.gif">');
				},
				success : function(responseText) {
					$('#principal').html(responseText);
				}
			});
		} else {
			alert("Datos Incorrectos Ingresados");
		}

	});
	
	$('#registrar_producto_accion').click(function() {
		if ($('input:text[name=codigo]').val().match(/^[a-z0-9_-]{3,16}$/)
				&& $('input:text[name=precio_unitario_compra]').val().match(/^[0-9]+\u002E[0-9][0-9]$/)
				&& $('input:text[name=precio_unitario_venta]').val().match(/^[0-9]+\u002E[0-9][0-9]$/)
				&& $('input:text[name=stock]').val().match(/^[0-9]+$/)) {
			$.ajax({
				type: 'post',
				url : 'registrar_producto',
				data : {
					codigo : $('input:text[name=codigo]').val(),
					nombre : $('input:text[name=nombre]').val(),
					precio_unitario_compra : $('input:text[name=precio_unitario_compra]').val(),
					precio_unitario_venta : $('input:text[name=precio_unitario_venta]').val(),
					stock : $('input:text[name=stock]').val()
				},
				beforeSend: function() {
				    $('#principal').html('<img id="cargar" alt="cargar" src="image/cargar.gif">');
				},
				success : function(responseText) {
					$('#principal').html(responseText);
				}
			});
		} else {
			alert("Datos Incorrectos Ingresados");
		}

	});
	
	$('#borrar_producto_accion').click(function() {
		if ($('input:text[name=codigo]').val().match(/^[a-z0-9_-]{3,16}$/)) {
			$.ajax({
				type: 'post',
				url : 'borrar_producto',
				data : {
					codigo : $('input:text[name=codigo]').val()
				},
				beforeSend: function() {
				    $('#principal').html('<img id="cargar" alt="cargar" src="image/cargar.gif">');
				},
				success : function(responseText) {
					$('#principal').html(responseText);
				}
			});
		} else {
			alert("Datos Incorrectos Ingresados");
		}
	});
	
	$('#aumentar_producto_accion').click(function() {
		if ($('input:text[name=codigo]').val().match(/^[a-z0-9_-]{3,16}$/)
				&& $('input:text[name=stock]').val().match(/^[0-9]+$/)) {
			$.ajax({
				type: 'post',
				url : 'aumentar_producto',
				data : {
					codigo : $('input:text[name=codigo]').val(),
					stock : $('input:text[name=stock]').val()
				},
				beforeSend: function() {
				    $('#principal').html('<img id="cargar" alt="cargar" src="image/cargar.gif">');
				},
				success : function(responseText) {
					$('#principal').html(responseText);
				}
			});
		} else {
			alert("Datos Incorrectos Ingresados");
		}

	});
	
	$('#reducir_producto_accion').click(function() {
		if ($('input:text[name=codigo]').val().match(/^[a-z0-9_-]{3,16}$/)
				&& $('input:text[name=stock]').val().match(/^[0-9]+$/)) {
			$.ajax({
				type: 'post',
				url : 'reducir_producto',
				data : {
					codigo : $('input:text[name=codigo]').val(),
					stock : $('input:text[name=stock]').val()
				},
				beforeSend: function() {
				    $('#principal').html('<img id="cargar" alt="cargar" src="image/cargar.gif">');
				},
				success : function(responseText) {
					$('#principal').html(responseText);
				}
			});
		} else {
			alert("Datos Incorrectos Ingresados");
		}
	});
	
	$('#modificar_admin_accion').click(function() {
		if ($('input:password[name=contrasena1]').val().match(/^.+$/)
				&& $('input:password[name=contrasena2]').val().match(/^.+$/)) {
			$.ajax({
				type: 'post',
				url : 'login',
				data : {
					cambio : 'true',
					contrasena1 : $('input:password[name=contrasena1]').val(),
					contrasena2 : $('input:password[name=contrasena2]').val()
				},
				beforeSend: function() {
				    $('#principal').html('<img id="cargar" alt="cargar" src="image/cargar.gif">');
				},
				success : function(responseText) {
					$('#principal').html(responseText);
				}
			});
		} else {
			alert("Datos Incorrectos Ingresados");
		}
		
	});
});


