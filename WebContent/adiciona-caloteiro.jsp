<!DOCTYPE html>

<%@ include file="/includes.jsp"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	
	<c:import url="cabecalho.jsp"/>
	
	<hr>
		Usuario logado: ${usuarioLogado.nome}
	<hr>
	
	<form action="sistema" method="post" id="formAdicionaCaloteiro">
		<input type="hidden" name="logica" value="AdicionaCaloteiro" />
		<triadTag:campoTexto
		label="Nome:" 
		campoNome="nome" 
		id="labelNome">
		</triadTag:campoTexto> </br>
		
		<triadTag:campoTexto
		label="Email:" 
		campoNome="email" 
		id="labelEmail">
		</triadTag:campoTexto> </br>
		
		<triadTag:campoTexto
		label="Devendo:" 
		campoNome="devendo" 
		id="labelDevendo">
		</triadTag:campoTexto> </br>
		
		<triadTag:campoTexto
		label="Data da  Dívida:" 
		campoNome="dataDivida" 
		id="labelData">
		</triadTag:campoTexto> </br>
		
		<input type="submit" value="Salvar"/>	
	</form>
	
	<c:import url="rodape.jsp"/>
	
	<script src="js/jquery-2.1.0.min.js" type="text/javascript"></script>
	<script src="js/jquery.maskMoney.min.js" type="text/javascript"></script>
	<script src="js/jquery.validate.min.js" type="text/javascript"></script>
	<script src="js/mascara-validacoes.js" type="text/javascript"></script>
	
</body>

</html>