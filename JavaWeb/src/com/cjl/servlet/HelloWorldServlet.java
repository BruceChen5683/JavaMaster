package com.cjl.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by chenjianliang on 2017/6/23.
 */
public class HelloWorldServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>hi,girl</title></head>");
        out.println("<body><h1>line  hello world "+ new Date().toLocaleString()+ "</h1></body></html>");
        out.flush();
    }
}
