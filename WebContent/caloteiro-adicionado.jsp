<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Caloteiro</title>
</head>
<body>
	Caloteiro ${param.nome} adicionado com sucesso!
	
	<form action="sistema" method="post">
		<input type="hidden" name="logica" value="ListaCaloteiro" />
	<input type="submit" value="Listar"/>	
	</form>
	
</body>
</html>