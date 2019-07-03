package com.cjl.servlet.session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by chenjianliang on 2017/8/2.
 */
@WebServlet(name = "UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User();
        HttpSession session = request.getSession();


        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String authority = request.getParameter("authority");
        if("1".equals(authority)){
            if("admin".equals(username) && "123".equals(password)){
                user.setUsername(username);
                user.setPassword(password);
                user.setAuthoority(authority);

                session.setAttribute("user",user);
            }else{
                error(request,response);

            }
        }else if("2".equals(authority)){
            if("cjl".equals(username) && "123".equals(password)){
                user.setUsername(username);
                user.setPassword(password);
                user.setAuthoority(authority);

                session.setAttribute("user",user);
            }else{
                error(request,response);

            }
        }else{
            //error
            error(request,response);
        }

    }
    private void error(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
