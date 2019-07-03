<%@ page import="java.io.File" %>
<%@ page import="org.w3c.dom.Document" %>
<%@ page import="javax.xml.parsers.DocumentBuilderFactory" %>
<%@ page import="javax.xml.parsers.DocumentBuilder" %>
<%@ page import="org.xml.sax.SAXParseException" %>
<%@ page import="org.w3c.dom.NodeList" %><%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/7/9
  Time: 下午11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员后台</title>
</head>
<body>


    <%

        String name = (String) session.getAttribute("adminName");
        String password = (String) session.getAttribute("adminPassword");

        if(name!= null && password !=null){

        }else{
            name =  request.getParameter("adminName");
            password = request.getParameter("adminPassword");
            session.setAttribute("adminName",name);
            session.setAttribute("adminPassword",password);
        }


//        if(session.getAttribute("adminName"))
//        session.setAttribute("adminName",name);
//        session.setAttribute("adminPassword",password);

        boolean success = false;

        File adminDB = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = null;
        try {
            adminDB = new File("/Users/chenjianliang/IdeaProjects/JavaWeb/web/adminDB.xml");
            if(!adminDB.exists()){
                adminDB.createNewFile();
            }

            doc = builder.parse(adminDB);
        }catch (SAXParseException e){
            adminDB.delete();
            adminDB = new File("/Users/chenjianliang/IdeaProjects/JavaWeb/web/defaultAdmimDB.xml");
            if(!adminDB.exists()){
                out.print("网页没有默认数据");
                return;
            }else{
                out.print("使用defaultAdminDB.xml");
                out.print("<br>");
            }
            doc = builder.parse(adminDB);
        }
        NodeList nl  = doc.getElementsByTagName("admin");
        for(int i = 0; i < nl.getLength();i++){
            out.print(i);
            if(name.equals(doc.getElementsByTagName("name").item(i).getFirstChild().getNodeValue())
                    &&
                    password.equals(doc.getElementsByTagName("password").item(i).getFirstChild().getNodeValue())){

                success = true;
                break;
            }

//            out.print("管理员:" + );
//            out.print("&nbsp;&nbsp;&nbsp;");
//            out.println("密码:" + );
//            out.print("<br>");

        }

        if(success){
            out.print("恭喜登录成功");
            out.print("<br>");
            %>

    <form action="QuestionDb.jsp">
        题目类型:&nbsp;&nbsp;&nbsp;单选<input type="radio" name="Qtype" value="sigle">&nbsp;&nbsp;&nbsp;多选<input type="radio" name="Qtype" value="multi"><br>
        题目名称<input type="text" name="Qtitle" ><br>
        题目选项A<input type="text" name="Qa"><br>
        题目选项B<input type="text" name="Qb"><br>
        题目选项C<input type="text" name="Qc"><br>
        题目选项D<input type="text" name="Qd"><br>

        提交<input type="submit">
    </form>




    <%
        }else{

        }
    %>
</body>
</html>
