package com.cjl.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chenjianliang on 2017/5/17.
 */
public class TestButton {

    public void go(Frame frame,Component component){
        frame.add(component,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TestButton testButton = new TestButton();
        Frame frame = new Frame("testBtn");
        Button btn = new Button("Button");

        testButton.go(frame,btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("getActionCommand  "+e.getActionCommand());

                System.out.println("getModifiers  "+e.getModifiers());

            }
        });

    }
}

