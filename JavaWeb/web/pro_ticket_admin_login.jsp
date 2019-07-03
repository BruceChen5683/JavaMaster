<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/7/10
  Time: 上午12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<form action="AdminLoginServlet">
    <%--<%--%>
        <%--if(request!= null && request.getAttribute("reLogin") != null){%>--%>
            <%--管理员<input type="text" name="adminName" value="<%= request.getParameter("adminName")%>"><br>--%>
            <%--密码<input type="password" name="adminPassword" value="<%= request.getParameter("adminPassword")%>"><br>--%>
    <%--<%   }else{%>--%>

            管理员<input type="text" name="adminName"><br>
            密码<input type="password" name="adminPassword"><br>
        <%--<%--%>
    <%--}--%>
    <%--%>--%>
    登录<input type="submit">&nbsp;&nbsp;&nbsp;取消<input type="reset"><br>


</form>

</body>
</html>
