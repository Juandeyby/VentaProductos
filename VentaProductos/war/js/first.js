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
});

$(document).ready(function() {
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
});

$(document).ready(function() {
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
});


