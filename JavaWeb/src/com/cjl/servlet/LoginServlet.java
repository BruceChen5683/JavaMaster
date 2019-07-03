package com.cjl.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by chenjianliang on 2017/6/24.
 */
public class LoginServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getInput(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getInput(req, resp);
    }

    private void getInput(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();


        out.println("<html><head><title>Login Result</title></head>");
        out.println("<body> username : "+ username+"  <br> ");
        out.println("password : "+password +"<br> </body></html>");

//        String host = req.getRemoteHost();
//        String user = req.getRemoteUser();
        out.flush();
    }



}
