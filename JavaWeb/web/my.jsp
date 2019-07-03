<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/6/24
  Time: 下午3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="LoginServlet"  method="get">  <!--MyServlet-->
        username:<input type="text" name="username"><br>
        password:<input type="password" name="password"><br>
        repassword:<input type="password" name="repassword"><br>
        age:<input type="number" name="age"><br>

        submit:<input type="submit">&nbsp;&nbsp;&nbsp;
        resest:<input type="reset">
    </form>
</body>
</html>
