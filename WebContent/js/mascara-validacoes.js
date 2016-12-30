

$(document).ready(function(){
	$('#labelDevendo').maskMoney();
})


	
$("#formAdicionaCaloteiro").validate({
	rules: {
		nome: {
			required:true,
			maxlength: 45
		},
		email: {
			required:true,
			email: true
		}
	},
	messages: {
		nome: {
			required: "Esse campo e obrigatorio",
			maxlength: "O campo nome nao pode ter mais que 45 caracteres"
		},
		email: {
			required: "Esse campo e obrigatorio",
			email: "Este nao e um email valido"
		}
	}
});

jQuery.validator.setDefaults({
	debug: true,
	success: "valid"
});