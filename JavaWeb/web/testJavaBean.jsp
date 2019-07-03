<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/7/16
  Time: 下午10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="com.cjl.servlet.ticket.AdminInfo" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="adminInfo" class="com.cjl.servlet.ticket.AdminInfo" ></jsp:useBean>


    <jsp:getProperty name="adminInfo" property="password"></jsp:getProperty>

<%--<jsp:setProperty name="adminInfo" property="password"></jsp:setProperty>--%>

    <jsp:setProperty name="adminInfo" property="name" param="hi"></jsp:setProperty>


    <jsp:getProperty name="adminInfo" property="password"></jsp:getProperty>

<%= adminInfo.getPassword()%>


</body>
</html>
