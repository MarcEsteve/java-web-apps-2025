<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Contacto Akkodis</title>
	<link rel="stylesheet" href="<c:url value='/css/estilo.css' />" />
</head>
<body>
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
</body>
</html>
