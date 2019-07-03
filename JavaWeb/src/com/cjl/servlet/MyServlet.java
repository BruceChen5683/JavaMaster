package com.cjl.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by chenjianliang on 2017/6/24.
 */
@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        int age =  Integer.parseInt(request.getParameter("age"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Login Result</title></head>");

        if(!password.equals(repassword)){
            out.println("<body>   "+ "password != repassword"+"  <br> ");
        }else{
            if(age <= 18){
                out.println("<body>   "+ "age < = 18"+"  <br> ");
            }else{
                out.println("<body>   "+ "Success!!!"+"  <br> ");
            }
        }
        out.flush();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
