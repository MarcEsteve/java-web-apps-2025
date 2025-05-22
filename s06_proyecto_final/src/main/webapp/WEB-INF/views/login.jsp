<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesión - Akkodis</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilo.css" />
</head>
<body>

<div class="login-container">
    <img src="https://www.akkodis.com/-/jssmedia/project/akkodis/akkodis/logos/header-rd-logo.png" alt="Logo Akkodis">
    <h2>Inicia sesión</h2>

    <form action="${pageContext.request.contextPath}/login" method="post">
        <div class="form-group">
            <label for="username">Usuario</label>
            <input type="text" id="username" name="username" required/>
        </div>
        <div class="form-group">
            <label for="password">Contraseña</label>
            <input type="password" id="password" name="password" required/>
        </div>
        <button type="submit" class="login-button">Acceder</button>
    </form>

    <c:if test="${not empty error}">
        <p class="error-message">⚠️ Usuario o contraseña incorrectos</p>
    </c:if>
</div>

</body>
</html>
