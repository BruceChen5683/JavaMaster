package com.cjl.servlet.ticket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by chenjianliang on 2017/7/12.
 */
@WebServlet(name = "AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = (String) request.getSession().getAttribute("adminName");
        String password = (String) request.getSession().getAttribute("adminPassword");

        if(name!= null && password !=null){

        }else{
            name =  request.getParameter("adminName");
            password = request.getParameter("adminPassword");
            request.getSession().setAttribute("adminName",name);
            request.getSession().setAttribute("adminPassword",password);
        }


    }
}
