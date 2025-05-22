<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Editar Perfil - Akkodis</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilo.css" />
    <style>
        body {
            font-family: "Segoe UI", sans-serif;
            background: #f7fafd;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #003e66;
            padding: 20px;
            text-align: center;
        }

        header img {
            height: 50px;
        }

        nav {
            background-color: #005f99;
            text-align: center;
            padding: 10px;
        }

        nav a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
            font-weight: bold;
        }

        .container {
            max-width: 600px;
            margin: 40px auto;
            background-color: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 6px 20px rgba(0,0,0,0.1);
        }

        h2 {
            color: #003e66;
            text-align: center;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            font-weight: bold;
            margin-top: 20px;
            color: #333;
        }

        input[type="text"], input[type="email"], input[type="date"], input[type="password"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 6px;
            margin-top: 5px;
        }

        input[type="submit"] {
            margin-top: 30px;
            padding: 12px;
            background-color: #003e66;
            color: white;
            font-weight: bold;
            border: none;
            border-radius: 6px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #00508a;
        }
    </style>
</head>
<body>

<header>
    <img src="https://www.akkodis.com/-/jssmedia/project/akkodis/akkodis/logos/header-rd-logo.png" alt="Akkodis">
</header>

<nav>
    <a href="${pageContext.request.contextPath}/perfil">Mi Perfil</a>
    <a href="${pageContext.request.contextPath}/editar">Editar Perfil</a>
    <a href="${pageContext.request.contextPath}/logout">Cerrar sesión</a>
</nav>

<div class="container">
    <h2>✏️ Editar Perfil</h2>

    <form:form modelAttribute="usuario" method="post" action="${pageContext.request.contextPath}/editar">
        <label for="nombre">Nombre:</label>
        <form:input path="nombre" id="nombre"/>

        <label for="correo">Correo electrónico:</label>
        <form:input path="correo" id="correo"/>

        <label for="fechaNacimiento">Fecha de nacimiento:</label>
        <form:input path="fechaNacimiento" id="fechaNacimiento" type="date"/>

        <input type="submit" value="Guardar cambios"/>
    </form:form>
</div>

</body>
</html>
