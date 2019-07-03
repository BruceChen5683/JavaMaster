<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/8/2
  Time: 上午9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="UserLoginServlet" method="post">
        username<input type="text" name="username"><br>
        password<input type="password" name="password"><br>
        权限:
        <select name="authority">
            <option value="1">管理员</option>
            <option value="2" <%= "selected"%>>普通用户</option>
        </select><br>
        submit<input type="submit">

    </form>
</body>
</html>
