package com.example.j2ee_hello.servlet.using.webconfig;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        // accept a query params, and then show a message that like this: "Hello, {name}"
        // e.g. http://localhost:8080/demo?name=Tom
        // if no query params, show a message that like this: "Hello, Empty Param"
        String name = request.getParameter("name");
        if (name == null) {
            name = "Empty Param";
        }
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + name + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // show same message as GET method
        doGet(request, response);
    }
}
