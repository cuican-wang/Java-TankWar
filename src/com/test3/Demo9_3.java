package com.test3;

import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Wang on 5/25/2017.
 */
public class Demo9_3 extends JFrame implements ActionListener{
    JPanel mp = null;
    JButton jb1 = null;
    JButton jb2 = null;
    public static void main(String [] args){
        Demo9_3 demo9_3 = new Demo9_3();
    }
    public Demo9_3(){
        mp = new JPanel();
        mp.setBackground(Color.pink);
        jb1 = new JButton("Black");
        jb1.setFont(new Font("Garamond",Font.BOLD,50));
        jb2 = new JButton("Red");
        jb2.setFont(new Font("Garamond",Font.BOLD,50));

        this.add(jb1,BorderLayout.NORTH);
        this.add(mp);
        this.add(jb2,BorderLayout.SOUTH);

        //register listening
        jb1.addActionListener(this);
        jb1.setActionCommand("black");
        jb2.addActionListener(this);
        jb2.setActionCommand("red");

        this.setSize(2000,1500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("handled");
        if(e.getActionCommand().equals("black")){
            mp.setBackground(Color.BLACK);
        }else if (e.getActionCommand().equals("red")){
            mp.setBackground(Color.RED);
        }
    }
}

//class MyPanel extends JPanel{
//    public void paint(Graphics g){
//        super.paint(g);
//        g.
//    }
//}