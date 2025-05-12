<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Login de Usuario</title>
</head>
<body>
    <h2>Iniciar Sesión</h2>
    <form:form method="post" modelAttribute="usuario" action="${pageContext.request.contextPath}/login">
        <table>
            <tr>
                <td>Nombre de Usuario:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Contraseña:</td>
                <td><form:password path="pass" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Ingresar" /></td>
            </tr>
        </table>
    </form:form>
    <c:if test="${not empty mensaje}">
        <p style="color:red;">${mensaje}</p>
    </c:if>
</body>
</html>
