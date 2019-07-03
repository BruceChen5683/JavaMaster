<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/7/6
  Time: 上午9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--直接跳转servlet连接--%>
<%--<a href="LoginServlet">Login</a>--%>

   <% String name,username;

   username = (String) request.getAttribute("username");

   name = (String) session.getAttribute("LoginName");
   if(name == null){%>
       <h1>未登录</h1>
   <%
   }else{%>
   <h1><%=name %>已经登录</h1><br>

   <h1><%=username %>.....</h1>
   <%
   }
   %>

</body>
</html>
