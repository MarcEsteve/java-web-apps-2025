<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mi Perfil - Akkodis</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilo.css" />
</head>
<body>

    <div class="header">
        <img src="https://www.akkodis.com/-/jssmedia/project/akkodis/akkodis/logos/header-rd-logo.png" alt="Akkodis" height="60">
        <div class="user-info">
            <span>Bienvenido, ${usuario.nombre}</span> |
            <a href="${pageContext.request.contextPath}/logout">Cerrar sesión</a>
        </div>
    </div>

    <div class="container">
        <h2>Mi Perfil</h2>

        <table class="profile-table">
            <tr>
                <th>Nombre</th>
                <td>${usuario.nombre}</td>
            </tr>
            <tr>
                <th>Correo</th>
                <td>${usuario.correo}</td>
            </tr>
            <tr>
                <th>Fecha de nacimiento</th>
                <td>${usuario.fechaNacimiento}</td>
            </tr>
        </table>

        <br/>
        <a class="btn" href="${pageContext.request.contextPath}/editar">Editar Perfil</a>
    </div>

</body>
</html>
