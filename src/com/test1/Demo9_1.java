//package com.test1;
//
//import javax.swing.*;
//import java.awt.*;
///**
// * Created by Wang on 5/25/2017.
// */
//public class Demo9_1 extends JFrame{
//
//    public static void main(String [] args){
//        Demo9_1 demo9_1 = new Demo9_1();
////        MyPanel mp = new MyPanel();
////        demo9_1.add(mp);
////        demo9_1.setSize(3200,1600);
////        demo9_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        demo9_1.setVisible(true);
//    }
//    public Demo9_1(){
//        MyPanel mp = new MyPanel();
//        this.add(mp);
//        this.setSize(3200,1600);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
//    }
//}
////Define mypanel used to draw and display
//class MyPanel extends JPanel{
//    //cover jpanel's paint method
//    //graphics is a important class of paint. can be understood as a paintbrush
//    public void paint(Graphics g){
//        //call superclass to initial
//        super.paint(g);
////        System.out.println("paint has been called again");
////        firstly, draw a circle
////        g.drawOval(10, 10, 30, 30);
////        g.drawLine(0,0,100,100);
////        g.drawRect(0,0,100,1000);
////        g.setColor(Color.CYAN);
////        g.fill3DRect(10,10,1000,100, false);
////        g.setColor(Color.black);
////        g.fill3DRect(100,100,1000,100, false);
//        //draw a image
////        Image im = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/pic.jpg"));
////        g.drawImage(im, 90,90,480,640,this);
//        g.setColor(Color.BLUE);
//        g.setFont(new Font("Garamond",Font.BOLD,50));
//        g.drawString("Hi Lenny", 100, 100);
//
//    }
//}