package com.test5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Wang on 5/26/2017.
 */
public class Demo9_5 extends JFrame{
    MyPanel mp = null;
    public static void main(String[] args){
        Demo9_5 demo9_5 = new Demo9_5();
    }
    public Demo9_5(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(2000,1500);
        this.setVisible(true);
        this.addMouseListener(mp);
        this.addKeyListener(mp);
        this.addMouseMotionListener(mp);
    }
}
//let mypanel know if I press my mouse and my coordinate
//let mypanel know which key I pressed
class MyPanel extends JPanel implements MouseListener, KeyListener, MouseMotionListener{
    public void paint(Graphics g){
        super.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("X= "+e.getX()+" Y= "+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse in");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse out");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("You pressed " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //System.out.println("Current Coordinate: "+e.);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Current Coordinate: "+e.getLocationOnScreen());
    }
}