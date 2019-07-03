package com.cjl.servlet;

import com.cjl.servlet.ticket.AdminInfo;
import com.cjl.servlet.ticket.XmlHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by chenjianliang on 2017/7/11.
 */
public class MainTest {
    public static void main(String[] args) {
        File file = new File("/Users/chenjianliang/IdeaProjects/JavaWeb/web/qqq.xml");


        XmlHelper xmlHelper = XmlHelper.getInstance();
//        AdminInfo adminInfo = new AdminInfo("cjl","nono");

//        xmlHelper.createXmlFile(file,xmlHelper.createDocWithBean("adminDB",adminInfo));

        try {
            xmlHelper.addInfoXml(file,"CC",new AdminInfo("lll","123"));
        } catch (Exception e) {
            e.printStackTrace();
        }


//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = null;
//        try {
//            builder = factory.newDocumentBuilder();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }
//        Document document = builder.newDocument();
//
//        if(document == null){
//            System.out.println("null");
//        }
//
//        Element element = document.createElement("DB");
//
//        document.appendChild(element);
//
//        TransformerFactory transformerFactory = TransformerFactory.newInstance();
//        try {
//            Transformer transformer = transformerFactory.newTransformer();
//
//            transformer.transform(new DOMSource(document),new StreamResult(file));
//        } catch (TransformerException e) {
//            e.printStackTrace();
//        }



//        Node node = document.createTextNode("no");
//        node.setNodeValue("110");
//        element.appendChild(node);
//
//
//
//        System.out.println(document.getElementById("DB"));
//
//        System.out.println(document.getElementsByTagName("DB").getLength());
//
//        System.out.println(document.getElementsByTagName("DB").item(0).getFirstChild().getNodeValue());
//
//        System.out.println(document);
    }
}
