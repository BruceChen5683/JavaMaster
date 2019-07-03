package com.cjl.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by chenjianliang on 2017/8/1.
 */
@WebServlet(name = "CookieServlet")
public class CookieServlet extends HttpServlet {
    private int count1;
    private int count2;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("CookieName"+count1++,"CookieValue"+count2++);
        cookie.setMaxAge(15);
        response.addCookie(cookie);

        PrintWriter printWriter = response.getWriter();

        Cookie[] cookies = request.getCookies();
        if(cookies == null)
            return;

        for (Cookie c:cookies){
//            PriprintWriter = new PrintWriter(response.getOutputStream());

            printWriter.println(c.getName());
            printWriter.println(c.getValue());

        }
    }
}
