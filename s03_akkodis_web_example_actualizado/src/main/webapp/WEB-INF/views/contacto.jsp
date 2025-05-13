<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacto Akkodis</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilo.css" />
</head>
<body>
	<div class="logo-header">
    	<a href="inicio"><img src="https://www.akkodis.com/-/jssmedia/project/akkodis/akkodis/logos/header-rd-logo.png" alt="Akkodis" style="margin: 20px;"/></a>
   	</div>
	<br/>
    <div class="menu">
        <a href="inicio">Inicio</a> |
        <a href="servicios">Servicios</a>|
        <a href="somos">Quiénes somos</a> |
        <a href="contacto">Contacto</a>
    </div>
    <h1>Formulario de Contacto</h1>
    <form action="contacto" method="post">
        <label>Nombre: <input type="text" name="nombre" /></label><br/>
        <label>Correo: <input type="email" name="correo" /></label><br/>
        <label>Mensaje: <textarea name="mensaje"></textarea></label><br/>
        <input type="submit" value="Enviar" />
    </form>
    <img src="${pageContext.request.contextPath}/img/akkodis-logo.png" alt="Logo" />
</body>
</html>
