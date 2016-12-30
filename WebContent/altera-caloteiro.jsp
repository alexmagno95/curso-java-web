<!DOCTYPE html>

<%@ include file="/includes.jsp"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<c:import url="cabecalho.jsp"/>
	<form action="sistema" method="post">
		<input type="hidden" name="logica" value="AlteraCaloteiro" />
				
		<triadTag:campoTexto
		label="Nome:" 
		campoNome="nome" 
		id="labelNome"
		value="${caloteiro.nome}">
		</triadTag:campoTexto> </br>
		
		<triadTag:campoTexto
		label="Email:" 
		campoNome="email" 
		id="labelEmail"
		value="${caloteiro.nome}">
		</triadTag:campoTexto> </br>
		
		<triadTag:campoTexto
		label="Devendo:" 
		campoNome="devendo" 
		id="labelDevendo"
		value="${caloteiro.devendo}">
		</triadTag:campoTexto> </br>
		
		<triadTag:campoTexto
		label="Data da  Dívida:" 
		campoNome="dataDivida" 
		id="labelData"
		value="${caloteiro.dataDivida}">
		</triadTag:campoTexto> </br>
				
		<input type="submit" value="Salvar"/>	
	</form>

</body>

<c:import url="rodape.jsp"/>

</html>