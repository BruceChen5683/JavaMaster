<%@ page import="javax.swing.*" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/6/24
  Time: 下午3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%

    String name = request.getParameter("username");
    session.setAttribute("LoginName",name);


    request.setAttribute("username",name);
    %>

<jsp:forward page="check.jsp"></jsp:forward>

<%
    Enumeration enumeration = request.getParameterNames();



    while (enumeration.hasMoreElements()){
//        System.out.println(enumeration.nextElement());
        out.print(enumeration.nextElement());
    }

    out.print("ddd");
%>
    <%--<% String username = request.getParameter("username");--%>

        <%--out.println(username);--%>

        <%--JFrame frame = new JFrame();--%>
        <%--frame.getContentPane().add(new JButton("button"));--%>
        <%--frame.setVisible(true);--%>
    <%--%>--%>

<a href="check.jsp">check</a>
</body>
</html>
