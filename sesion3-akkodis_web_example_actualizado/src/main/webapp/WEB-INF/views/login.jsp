<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login de Usuario</title>
    <style>
		form {
			width: 300px;
			margin: 0 auto;
			padding: 20px;
			border: 1px solid #ccc;
			border-radius: 5px;
		}
	</style>
</head>
<body>
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
