<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gracias</title>
	<style>
        .menu {
            margin-bottom: 20px;
        }
        .menu a {
            margin-right: 10px;
            text-decoration: none;
            color: #333;
        }
        body {
		    font-family: 'Segoe UI', sans-serif;
		    background-color: #f2f4f8;
		    color: #333;
		    padding: 2rem;
		    text-align: center;
		}
		h1 {
		    color: #0055a4;
		}
		a {
		    color: #007bff;
		    text-decoration: none;
		}
		.menu {
		    margin-bottom: 1rem;
		}
		input, textarea {
		    width: 80%;
		    padding: 0.5rem;
		    margin: 0.5rem;
		}
    </style>
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
    <h1>¡Gracias, ${nombre}!</h1>
    <p>Hemos recibido tu mensaje. Nos pondremos en contacto contigo pronto.</p>
	<img src="${pageContext.request.contextPath}/img/logo.png" alt="Logo de Akkodis" />

</body>
</html>
