package com.test6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * Created by Wang on 5/25/2017.
 */
public class MyTankGame2 extends JFrame{
    MyPanel mp = null;
    public static void main(String [] args){
        MyTankGame2 mtg = new MyTankGame2();
    }
    //Constructor
    public MyTankGame2(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(3200,1800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(mp);
    }
}

//My Panel
class MyPanel extends JPanel implements KeyListener{
    //my tank
    Hero hero = null;
    //define enemies
    Vector<EnemyTank> ets = new Vector<EnemyTank>();
    int enemySize = 5;
    //constructor
    public MyPanel(){
        hero = new Hero(100,1500);
        //init enemies
        for(int i = 0;i < enemySize;i++){
            EnemyTank et = new EnemyTank((i+1)*200, 300);
            et.setDirection(2);
            et.setColor(0);
            ets.add(et);
        }
    }
    //paint
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.gray);
        g.fillRect(0,0,3200,1800);
        drawTank(hero.getX(),hero.getY(),g,hero.direction,0);
        for(int i = 0;i<ets.size();i++){
            this.drawTank(ets.get(i).getX(),ets.get(i).getY(),g,ets.get(i).getDirection(),1);
        }
    }
    public void drawTank(int x, int y, Graphics g, int direction, int type){
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
        switch(direction){
            //up
            case 0:
                //draw my tank
                //1.draw the left rectangle
//                g.setColor(Color.CYAN);
                g.fill3DRect(x-30,y-30,15,60,true);
                //2. draw the right rectangle
                g.fill3DRect(x+14, y-30, 15, 60,true);
                //3. draw the middle rectangle
                g.fill3DRect(x-15, y-15,30,30,false);
                //4. draw the circle
                g.fillOval(x-17,y-16,30,30);
                g.drawLine(x+0, y+0, x+0,y-40);
                break;
            case 1:
                //left rect
                g.fill3DRect(x-30,y-30,60,15,true);
                //middle rect
                g.fill3DRect(x-16, y-15,31,31,false);
                //middle ball
                g.fillOval(x-16,y-16,30,30);
                //right rect
                g.fill3DRect(x-30, y+15, 60,15,true);
                g.drawLine(x,y,x+40,y);
                break;
            case 2:
                g.fill3DRect(x-30,y-30,15,60,true);
                //2. draw the right rectangle
                g.fill3DRect(x+14, y-30, 15, 60,true);
                //3. draw the middle rectangle
                g.fill3DRect(x-15, y-15,30,30,false);
                //4. draw the circle
                g.fillOval(x-17,y-16,30,30);
                g.drawLine(x-1, y+0, x-1,y+40);
                break;
            case 3:
                //left rect
                g.fill3DRect(x-30,y-30,60,15,true);
                //middle rect
                g.fill3DRect(x-16, y-15,31,31,false);
                //middle ball
                g.fillOval(x-16,y-16,30,30);
                //right rect
                g.fill3DRect(x-30, y+15, 60,15,true);
                g.drawLine(x,y,x-40,y);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
            this.hero.setDirection(0);
            this.hero.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D){
            this.hero.setDirection(1);
            this.hero.moveRight();
        }else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){
            this.hero.setDirection(2);
            this.hero.moveDown();
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A){
            this.hero.setDirection(3);
            this.hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
