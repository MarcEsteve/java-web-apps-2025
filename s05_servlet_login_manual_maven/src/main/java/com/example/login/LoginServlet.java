package com.example.login;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        if ("admin".equals(user) && "1234".equals(pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", user);
            response.sendRedirect("inicio.jsp");
        } else {
            response.sendRedirect("login.jsp?error=true");
        }
    }
}
