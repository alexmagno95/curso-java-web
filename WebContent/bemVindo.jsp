
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/includes.jsp"%>
<%String msg = "seja bem vindo ao meu JSP!"; %>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><% out.println(msg);%></title>

</head>

<c:import url="cabecalho.jsp"/>

<body>
	Olá <%=request.getParameter("nome") %>, <%=msg %>
	
	
</body>
</html>