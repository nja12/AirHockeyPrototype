/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airhockey;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Nick
 */
public class Paddle {
    
    public double x, y, xspeed, yspeed;

    public Paddle() {
    }

    public Paddle(double x, double y) {
        this.x = x;
        this.y = y;
        yspeed = 20;
        xspeed = 20;
        
    }
    
    public void displayPaddle(Graphics g){
        g.setColor(Color.black);
        g.fillOval((int)x, (int)y, 60, 60);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getXspeed() {
        return xspeed;
    }

    public void setXspeed(double xspeed) {
        this.xspeed = xspeed;
    }

    public double getYspeed() {
        return yspeed;
    }

    public void setYspeed(double yspeed) {
        this.yspeed = yspeed;
    }
    public void moveRight(){
        x = x + xspeed;
    }
    public void moveLeft(){
        x = x - xspeed;   
    }
    public void moveUP(){
        y = y - yspeed;
    }
    public void moveDown(){
        y = y + yspeed;
    }
}
