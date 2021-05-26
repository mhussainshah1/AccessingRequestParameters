package com.example.AccessingRequestParameters;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

//http://localhost:8080/name?firstName=Amir&lastName=Shah

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println(firstName +" " + lastName);
        if (firstName == null || lastName == null) {
            System.out.println("A full name is not provided");
        } else {
            System.out.println("Hello " + firstName + "  " + lastName + ", nice to meet you");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
