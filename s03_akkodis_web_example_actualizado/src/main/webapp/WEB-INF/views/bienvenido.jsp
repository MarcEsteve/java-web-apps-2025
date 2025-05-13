<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Bienvenido</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/estilo.css" />
</head>
<body>
	<div class="logo-header"">
		<a href="inicio">
		<img src="https://www.akkodis.com/-/jssmedia/project/akkodis/akkodis/logos/header-rd-logo.png"
			alt="Akkodis" style="margin: 20px;" />
		</a>
	</div>
	<br />
	<div class="menu">
		<a href="inicio">Inicio</a> | <a href="servicios">Servicios</a>| <a
			href="somos">Quiénes somos</a> | <a href="contacto">Contacto</a>
	</div>
	<h2>Bienvenido, ${name}!</h2>
	<p>Has iniciado sesión correctamente.</p>
</body>
</html>
