<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacto Akkodis</title>
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
		form {
		  display: flex;
		  flex-direction: column;
		  align-items: center;
		   margin-top: 2rem;
		  width: 100%;
		  max-width: 400px;
		  margin: 0 auto;
		  background-color: #fff;
		  padding: 20px;
		  border-radius: 8px;
		  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
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
    <h1>Formulario de Contacto</h1>
    <form action="contacto" method="post">
        <label>Nombre: <input type="text" name="nombre" /></label><br/>
        <label>Correo: <input type="email" name="correo" /></label><br/>
        <label>Mensaje: <textarea name="mensaje"></textarea></label><br/>
        <input type="submit" value="Enviar" />
    </form>
</body>
</html>
