package com.test4;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Wang on 5/25/2017.
 */
//Move a ball Up Down Left Right
public class Demo9_4 extends JFrame{
    MyPanel mp = null;
    public static void main(String [] args){
        Demo9_4 demo9_4 = new Demo9_4();
    }
    public Demo9_4(){
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(2000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel extends JPanel implements KeyListener{
    int x = 100;
    int y = 100;

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.PINK);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println(e.getKeyChar());
        if (e.getKeyCode()==KeyEvent.VK_DOWN){
            y++;
        }else if (e.getKeyCode()==KeyEvent.VK_UP){
            y--;
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            x--;
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            x++;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println(e.getKeyChar());
    }
}