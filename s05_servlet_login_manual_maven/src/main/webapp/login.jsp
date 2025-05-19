<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Login</title></head>
<body>
<h2>Iniciar sesión</h2>
<form method="post" action="login">
    Usuario: <input type="text" name="user"><br>
    Contraseña: <input type="password" name="pass"><br>
    <input type="submit" value="Entrar">
</form>
<% if ("true".equals(request.getParameter("error"))) { %>
    <p style="color:red;">Usuario o contraseña incorrectos</p>
<% } %>
</body>
</html>
