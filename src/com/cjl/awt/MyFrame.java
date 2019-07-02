package com.cjl.awt;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by chenjianliang on 2017/5/16.
 */
public class MyFrame extends Frame{

    public MyFrame(String title){
        super(title);
    }

    public static void main(String[] args) {

        MyFrame frame = new MyFrame("First GUI app");
        frame.setSize(500,500);


        Panel panel = new Panel();
        panel.setSize(50,50);
        panel.setBackground(Color.BLACK);
//        frame.add(panel);
        frame.setLayout(new BorderLayout());

        Button btn1 = new Button("33333");
        Button btn2= new Button("33333");

        btn1.setBackground(Color.BLUE);
        btn2.setBackground(Color.YELLOW);

        frame.add(new Button("111"));
        frame.add(new Button("2222"));
//        frame.pack();
        frame.setVisible(true);
        frame.removeAll();

        frame.add(btn1,BorderLayout.EAST);
        frame.add(btn2,BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
