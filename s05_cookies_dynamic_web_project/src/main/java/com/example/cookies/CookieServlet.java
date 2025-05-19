package com.example.cookies;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends jakarta.servlet.http.HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getServletPath();
        String usuario = "invitado";

        if (path.equals("/setcookie")) {
            Cookie c = new Cookie("usuario", "Marc");
            c.setMaxAge(3600); // 1 hour
            response.addCookie(c);
            response.sendRedirect("index.jsp");
            return;
        }

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("usuario".equals(c.getName())) {
                    usuario = c.getValue();
                }
            }
        }

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Bienvenido, " + usuario + "</h2>");
        response.getWriter().println("<p><a href='setcookie'>Establecer cookie de usuario</a></p>");
        response.getWriter().println("</body></html>");
    }
}
