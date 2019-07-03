<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/7/4
  Time: 上午9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<jsp:forward page="error.jsp">--%>
    <%--<jsp:param name="name" value="gold"></jsp:param>--%>
<%--</jsp:forward>--%>

<%--<% int i = 0;%>  &lt;%&ndash;此处代码不执行&ndash;%&gt;--%>
<body>

<% int a = 1;%>

<form action="MyForwardServlet">
    username<input type="text"  name="username"><br>

    <input type="hidden" name="wel"  value="<%= a %>">
    submit<input type="submit">

</form>

</body>
</html>
