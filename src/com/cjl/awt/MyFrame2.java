package com.cjl.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by chenjianliang on 2017/5/17.
 */
public class MyFrame2 implements ActionListener,WindowListener{

    public void go(){
        Frame frame = new Frame("Frame2");
        frame.setSize(500,500);
        Button btn = new Button("click me");
        frame.add(btn);
        btn.addActionListener(this);
        frame.addWindowListener(this);
        frame.setVisible(true);

        frame.addMouseMotionListener(new MyAdapter());

    }

    public static void main(String[] args) {
        MyFrame2 frame2 = new MyFrame2();
        frame2.go();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

class MyAdapter extends MouseMotionAdapter{

}
abstract class MyAdater2 implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
