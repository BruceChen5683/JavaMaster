<%@ page import="java.io.File" %>
<%@ page import="javax.xml.parsers.DocumentBuilderFactory" %>
<%@ page import="javax.xml.parsers.DocumentBuilder" %>
<%@ page import="org.w3c.dom.Document" %>
<%@ page import="javax.xml.transform.TransformerFactory" %>
<%@ page import="javax.xml.transform.Transformer" %>
<%@ page import="org.w3c.dom.Element" %>
<%@ page import="javax.xml.transform.stream.StreamResult" %>
<%@ page import="javax.xml.transform.Source" %>
<%@ page import="javax.xml.transform.dom.DOMSource" %>
<%@ page import="org.w3c.dom.NodeList" %>
<%@ page import="org.w3c.dom.Node" %><%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/7/10
  Time: 下午6:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>题目展示</title>
</head>
<body>

    <%
        String Qtype = "";
        String Qtitle = "";
        String Qa = "";
        String Qb = "";
        String Qc = "";
        String Qd = "";
    %>
    <%

        Qtitle = request.getParameter("Qtitle");
        Qa = request.getParameter("Qa");
        Qb = request.getParameter("Qb");
        Qc = request.getParameter("Qc");
        Qd = request.getParameter("Qd");

        Qtype = request.getParameter("Qtype");

        File file = new File("/Users/chenjianliang/IdeaProjects/JavaWeb/web/QuestionDb.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = null;
        Element db = null;
        int i = -1;
        if(file.exists()){
            document = builder.parse(file);
            db = document.getDocumentElement();
            NodeList list = document.getElementsByTagName("Question");
            i = list.getLength();//Question总数

            for(int j = 0;j < i;j++){


                Node qu = list.item(j);
                out.print(qu.getFirstChild().getAttributes().getNamedItem("num").getNodeValue());



                if(Qtitle.equals(list.item(j).getAttributes().getNamedItem("title").getNodeValue())){
                    out.print("问题 "+Qtitle+" 已经存在");

//                    RequestDispatcher dispatcher = request.getRequestDispatcher("pro_ticket_manager.jsp");
//                    dispatcher.forward(request,response);
                }
            }

        }else{
            document = builder.newDocument();
            db = document.createElement("DB");
        }

        Element root = document.createElement("Question");

        root.setAttribute("title",Qtitle);
        root.setAttribute("id",String.valueOf(i++));

        Element a = document.createElement("Qa");
        a.setAttribute("value",Qa);
        a.setAttribute("num",String.valueOf(0));
        Element b = document.createElement("Qb");
        b.setAttribute("value",Qb);
        b.setAttribute("num",String.valueOf(0));
        Element c = document.createElement("Qc");
        c.setAttribute("value",Qc);
        c.setAttribute("num",String.valueOf(0));
        Element d = document.createElement("Qd");
        d.setAttribute("value",Qd);
        d.setAttribute("num",String.valueOf(0));

        Element type = document.createElement("Qtype");
        type.setAttribute("value",Qtype);

        root.appendChild(a);
        root.appendChild(b);
        root.appendChild(c);
        root.appendChild(d);
        root.appendChild(type);

        db.appendChild(root);

        if(!file.exists()){
            document.appendChild(db);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source source = new DOMSource(document);
        StreamResult streamResult = new StreamResult(file);
        transformer.transform(source,streamResult);

    %>

        <%----%>
                    <%--<h1><%= Qtitle%></h1><br><%--%>

    <%--if(Qtype.equals("multi")){//多选--%>
        <%--%>--%>
            <%--<form>--%>
                <%--A.<%= Qa%><input type="checkbox" name="Question"><br>--%>
                <%--B.<%= Qb%><input type="checkbox" name="Question"><br>--%>
                <%--C.<%= Qc%><input type="checkbox" name="Question"><br>--%>
                <%--D.<%= Qd%><input type="checkbox" name="Question"><br>--%>
                <%--提交<input type="submit">--%>
            <%--</form>--%>
        <%--<%--%>
        <%--}else {//单选--%>
        <%--%>--%>
            <%--<form>--%>
                <%--A.<%= Qa%><input type="radio" name="Question"><br>--%>
                <%--B.<%= Qb%><input type="radio" name="Question"><br>--%>
                <%--C.<%= Qc%><input type="radio" name="Question"><br>--%>
                <%--D.<%= Qd%><input type="radio" name="Question"><br>--%>
                <%--提交<input type="submit">--%>
            <%--</form>--%>
        <%--<%--%>
        <%--}--%>

    <%--%>--%>
</body>
</html>
