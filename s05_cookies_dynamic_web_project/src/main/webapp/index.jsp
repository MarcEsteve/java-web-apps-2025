<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookie Demo</title>
</head>
<body>
    <p>Bienvenido, ${usuario}</p>
    <p><a href="setcookie">Establecer cookie de usuario</a></p>
    <c:if test="${empty usuario}">
  		<p><b>El atributo 'usuario' está vacío</b></p>
	</c:if>
	<%
    	String usuario = (String) request.getAttribute("usuario");
    	if (usuario == null) usuario = "null";
	%>
	<p>Bienvenido desde scriptlet: <%= usuario %></p>
	
</body>
</html>
