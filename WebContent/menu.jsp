<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/includes.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Meu Sistema Caloteiro</title>
</head>
<body>

	<c:import url="cabecalho.jsp"></c:import>
	
	<p>Seja bem vindo, ${usuarioLogado.nome} ao sistema caloteiros: </p>
	<p>Menu</p>
	<p>
		<ol>
			<a href='<c:url value="/adiciona-caloteiro.jsp" />'>
				Adiciona caloteiro
			</a>
		</ol>
		<ol>
			<a href='<c:url value="/sistema?logica=ListaCaloteiro" />'>
				Listar caloteiros
			</a>
		</ol>

	</p>

	<hr>
	Variáveis EL:
	<p>
		1. param: ${param.nome} </br>
		2. requestScope: ${requestScope.nome} </br>
		3. sessionScope: ${sessionScope.nome} </br>
		4. Sem especificar: ${nome}</br>
	</p>
	<hr>

		<c:import url="rodape.jsp"></c:import>

</body>
</html>