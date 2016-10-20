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
	
	$('#usuario_venta').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'usuario_venta'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#usuario_stock_ver').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'usuario_stock_ver'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#usuario_caja_ver').click(function() {
		$.ajax({
			url : 'redireccionar',
			data : {
				redireccionar : 'usuario_caja_ver'
			},
			success : function(responseText) {
				$('#principal').html(responseText);
			}
		});
	});
	
	$('#usuario_venta_accion').click(function() {
		if ($('input:text[name=codigo]').val().match(/^[a-z0-9_-]{3,16}$/)
				&& $('input:text[name=cantidad]').val().match(/^[0-9]+$/)) {
			$.ajax({
				type: 'post',
				url : 'usuario_venta',
				data : {
					codigo : $('input:text[name=codigo]').val(),
					cantidad : $('input:text[name=cantidad]').val()
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
