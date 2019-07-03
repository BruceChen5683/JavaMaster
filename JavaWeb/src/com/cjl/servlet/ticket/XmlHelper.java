package com.cjl.servlet.ticket;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chenjianliang on 2017/7/12.
 */
public class XmlHelper {
    private static XmlHelper mXmlHelper  = null;

    public static XmlHelper getInstance(){
        if(mXmlHelper == null){
            mXmlHelper = new XmlHelper();
        }
        return mXmlHelper;
    }


    private void create(File file){

    }

    public void createXmlFile(File file, Document document){
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerFactory.newTransformer();
            Source source = new DOMSource(document);
            StreamResult result = new StreamResult(file);
            transformer.transform(source,result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }


    public void addInfoXml(File file,String root,Object info) throws Exception{//暂时考虑document 只有一个
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document doc = null;
        if(file.exists()){
            doc = builder.parse(file);
            NodeList list = doc.getElementsByTagName(info.getClass().getSimpleName());
            for (int i = 0; i < list.getLength();i++){
                Field[] fields = info.getClass().getDeclaredFields();

                Class<?> clazz = info.getClass();
                Object temp = clazz.newInstance();

                for(int j = 0;j < fields.length;j++){
                    String name = fields[j].getName();
                    name = name.substring(0,1).toUpperCase()+name.substring(1);

                    String value = doc.getElementsByTagName(name).item(i).getTextContent();


                    Method method = info.getClass().getMethod("set"+name,new Class[]{fields[j].getType()});
                    method.setAccessible(true);
                    method.invoke(temp,new Object[]{value});
                }

                if(info.equals(temp)){//将要存储的是相同的对象
                    return;
                }
            }
            //新对象

//            NodeList roots = doc.getElementsByTagName(root);
//            Node oldRoot = roots.item(0);
//
//            Node newRoot = oldRoot.appendChild(infoToElement(doc,info));
//
//            DocumentBuilderFactory documentBuilderFactory1 = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder1 = null;
//            Document document1 = null;
//
//
//                builder1 = documentBuilderFactory1.newDocumentBuilder();
//                document1 = builder1.newDocument();
//            document1.appendChild(newRoot);
//
//            createXmlFile(new File("/Users/chenjianliang/IdeaProjects/JavaWeb/web/fff.xml"),document1);



        }else {
            createXmlFile(file,createDocWithBean(root,info));
        }

    }

    public Element infoToElement(Document document,Object info){
        Element element = document.createElement(info.getClass().getSimpleName());
        Field[] fields = info.getClass().getDeclaredFields();
        for(int i = 0;i < fields.length;i++){
            String name = fields[i].getName();
            name = name.substring(0,1).toUpperCase()+name.substring(1);
            Element nameE = document.createElement(name);
            try {

                Method method = info.getClass().getMethod("get"+name);
                nameE.setTextContent((String)method.invoke(info));
                element.appendChild(nameE);

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }
        return element;
    }

    public  Document createDocWithBean(String root,Object info){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        try {

            builder = documentBuilderFactory.newDocumentBuilder();
            document = builder.newDocument();

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Element rootElement = document.createElement(root);

        Element element = infoToElement(document,info);

        rootElement.appendChild(element);

        document.appendChild(rootElement);
//        File file = new File("/Users/chenjianliang/IdeaProjects/JavaWeb/web/cccc.xml");

//        createXmlFile(file, document);
        return document;
    }
}
