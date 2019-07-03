<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/7/4
  Time: 上午9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <%
            int row = Integer.parseInt(request.getParameter("row"));
            int col = Integer.parseInt(request.getParameter("col"));
//            out.print("<form>");
//            out.print("<table border=\"2\"> ");
//            for (int i = 0; i < row;i++){
//                out.print("<tr>");
//                for (int j = 0; j < col;j++){
//                    out.print("<td>aa");
//                    out.print("</td>");
//                }
//                out.print("</tr>");
//            }
//            out.print("</table>");
//            out.print("</form>");

        %>

<table>
    <% for (int i = 0; i < row;i++){ %>

        <tr>
            <%for (int j = 0; j < col;j++){%>
            <td>bb</td>
            <%}%>

        </tr>
    <%}%>
</table>

</body>
</html>
