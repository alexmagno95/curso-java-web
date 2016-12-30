<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/includes.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acessar sistema caloteiro</title>
</head>
	<body>
	
		<c:import url="cabecalho.jsp"></c:import>
		
		<form action="sistema?logica=AutenticaUsuario&nome=Parametro" method="post" id="formLogar">
		
			Login: <input type="text" name="login" value="" />
			Senha: <input type="password" name="senha" value="" />
			<input type="submit" value="Logar"/>
		
		</form>
		
		<p>${msgUsuario}</p>
		
		<c:import url="rodape.jsp"/>
		
	</body>
</html>