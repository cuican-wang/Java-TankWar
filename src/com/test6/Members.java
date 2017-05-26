package com.test6;

/**
 * Created by Wang on 5/26/2017.
 */
class Tank{
    int x = 0;
    int y = 0;
    //Speed
    int speed = 10;

    int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Directionion initially upward 0; 1 right, 2 downward, 3 left
    int direction = 0;

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

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

class Hero extends Tank {
    public Hero(int x, int y){
        super(x,y);
    }

    //move upward
    public void moveUp(){
        this.y -= speed;
    }
    public void moveRight(){
        this.x += speed;
    }
    public void moveDown(){
        this.y += speed;
    }
    public void moveLeft(){
        this.x -= speed;
    }
}

class EnemyTank extends Tank{
    public EnemyTank(int x, int y){
        super(x,y);
    }
}