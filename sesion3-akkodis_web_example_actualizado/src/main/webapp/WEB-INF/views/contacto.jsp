<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacto Akkodis</title>
	<link rel="stylesheet" href="/css/estilo.css" />
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
