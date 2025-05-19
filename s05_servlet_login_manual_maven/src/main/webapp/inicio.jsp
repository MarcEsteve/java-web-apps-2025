<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.*,jakarta.servlet.*" %>
<%
    String usuario = (session != null) ? (String) session.getAttribute("usuario") : null;
    if (usuario == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head><title>Inicio</title></head>
<body>
<h2>Bienvenido, <%= usuario %></h2>
<a href="logout.jsp">Cerrar sesión</a>
</body>
</html>
