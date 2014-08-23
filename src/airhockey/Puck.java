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
public class Puck {
    
    private double x, y;
    private double movex = 1;
    private double movey = 1;

    public Puck() {
    }

    public Puck(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void displayPuck(Graphics g){
        g.setColor(Color.black);
        g.fillOval((int)x, (int)y, 40, 40); 
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

    public double getMovex() {
        return movex;
    }

    public void setMovex(double movex) {
        this.movex = movex;
    }

    public double getMovey() {
        return movey;
    }

    public void setMovey(double movey) {
        this.movey = movey;
    }
    
}
