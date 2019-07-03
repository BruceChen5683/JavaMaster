package com.cjl.servlet;

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by chenjianliang on 2017/7/7.
 */
@WebServlet(name = "MyForwardServlet")
public class MyForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


//        response.sendRedirect("/cjl/myResult.jsp");
//        response.sendRedirect("myResult.jsp");

//        String username = request.getParameter("username");
//
//        request.getParameter("wel");
//
//        request.setAttribute("username",username);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("myResult.jsp");
//        requestDispatcher.forward(request,response);
    }
}
