<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login de Usuario</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilo.css" />
</head>
<body>
	<div style="text-align: center;background-color: #003e66">
    	<a href="inicio"><img src="https://www.akkodis.com/-/jssmedia/project/akkodis/akkodis/logos/header-rd-logo.png" alt="Akkodis" style="margin: 20px;"/></a>
   	</div>
	<br/>
    <div class="menu">
        <a href="inicio">Inicio</a> |
        <a href="servicios">Servicios</a>|
        <a href="somos">Quiénes somos</a> |
        <a href="contacto">Contacto</a>
    </div>
    <h1>Iniciar Sesión</h1>

    <form action="login" method="post">
        <label>Usuario: <input type="text" name="name" /></label><br/>
        <label>Contraseña: <input type="password" name="pass" /></label><br/>
        <input type="submit" value="Enviar" />
    </form>
    <c:if test="${not empty mensaje}">
        <p style="color:red;">${mensaje}</p>
    </c:if>
</body>
</html>
