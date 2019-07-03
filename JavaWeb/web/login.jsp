<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/6/24
  Time: 下午1:35
  To change this template use File | Settings | File Templates.
--%>
<%--errorPage="error.jsp"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<!-- hmtl comment   -->
<!-- <%= new java.util.Date() %>-->
<%-- jsp comment  --%>
<body>
    <form action="result.jsp" method="post">   <!-- /cjl/LoginServlet  前者相对路径-->
        username:<input type="text"  name="username"><br><!-- name 便于服务器接收-->
        password:<input type="password" name="password"><br>

        <input type="submit" value="submit">&nbsp;&nbsp;&nbsp;
        <input type="reset" value="reset">
    </form>

    <%
        int counter = 0;
        String str = application.getAttribute("counter").toString();
        if(str != null){
            counter = Integer.parseInt(str);
        }
        counter ++;

        %>
    你是第<%=counter%>位访问者
    <%
        application.setAttribute("counter",counter);
    %>

<%! int i; %>
    <% int b = 3; %>
    <%=i-- %>
    <%=b-- %>

    <%--<% int c = b/0; %>--%>

    <%@ include file="test2.jsp" %>

    <%--<% i = 4;%>--%>


</body>

<a href="test.txt" >link</a>
</html>
