package com.ejemplo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/formulario")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Recogemos los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");

        // Preparamos la respuesta HTML
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Gracias, " + nombre + " por suscribirte.</h2>");
        out.println("<p>Hemos registrado tu correo: <strong>" + correo + "</strong></p>");
        out.println("</body></html>");
    }
}
