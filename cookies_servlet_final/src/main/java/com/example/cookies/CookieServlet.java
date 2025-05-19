package com.example.cookies;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

import java.io.IOException;

public class CookieServlet extends jakarta.servlet.http.HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getServletPath();

        if (path.equals("/setcookie")) {
            Cookie cookie = new Cookie("usuario", "Marc");
            cookie.setMaxAge(3600); // 1 hora
            response.addCookie(cookie);
            response.sendRedirect(request.getContextPath() + "/");
            return;
        }

        String usuario = "invitado";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("usuario".equals(c.getName())) {
                    usuario = c.getValue();
                }
            }
        }

        request.setAttribute("usuario", usuario);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
