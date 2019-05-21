package com.cjl.jdk8;

import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SwingTest {
    public static void main(String[] args) {
        System.out.println("SwingTest.main");
        JFrame jFrame = new JFrame("test ");
        JButton jButton = new JButton("button");

        jButton.addActionListener(event -> {
            System.out.println("SwingTest.main btn pressed lambda 1");
            System.out.println("SwingTest.main btn pressed lambda 2");
            System.out.println("SwingTest.main btn pressed lambda 3");
        } );
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("SwingTest.actionPerformed btn pressed");
//            }
//        });

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
