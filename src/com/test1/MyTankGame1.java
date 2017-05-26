package com.test1;

import javax.swing.*;
import java.awt.*;
/**
 * Created by Wang on 5/25/2017.
 */
public class MyTankGame1 extends JFrame{
    MyPanel mp = null;
    public static void main(String [] args){
        MyTankGame1 mtg = new MyTankGame1();
    }
    //Constructor
    public MyTankGame1(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(3200,1800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//My Panel
class MyPanel extends JPanel{
    //my tank
    Hero hero = null;
    //constructor
    public MyPanel(){
        hero = new Hero(100,100);
    }
    //paint
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.gray);
        g.fillRect(0,0,3200,1800);
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }
    public void drawTank(int x, int y, Graphics g, int direct, int type){
        //judge type
        switch(type){
            case 0:
                g.setColor(Color.PINK);
                break;
            case 1:
                g.setColor(Color.MAGENTA);
                break;
        }
        //judge direction
        switch(direct){
            //up
            case 0:
                //draw my tank
                //1.draw the left rectangle
//                g.setColor(Color.CYAN);
                g.fill3DRect(x,y,15,60,true);
                //2. draw the right rectangle
                g.fill3DRect(x+45, y, 15, 60,true);
                //3. draw the middle rectangle
                g.fill3DRect(x+15, y+15,30,30,false);
                //4. draw the circle
                g.fillOval(x+15,y+15,29,29);
                g.drawLine(x+30,y+30,x+30, y-16);
        }
    }
}

class Tank{
    int x = 0;
    int y = 0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //public Tank(){}
    public Tank(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Hero extends Tank{
    public Hero(int x, int y){
        super(x,y);
    }
}