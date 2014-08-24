/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airhockey;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * Nicholas Adamson 31/03/2014
 * An Application to represent a game of AirHockey
 * 
 */

public class AirHockeyPanel extends JPanel {
    
    private HockeyCourtPanel courtPanel = new HockeyCourtPanel();
    private ScorePanel scorePanel = new ScorePanel();
    private Timer timer;
    private LayoutManager layout = new GridLayout(2, 1);
    

    public AirHockeyPanel() {
        this.setPreferredSize(new Dimension(2000, 1000));
        add(courtPanel);
        Listener timerListener = new Listener();
        timer = new Timer(5, timerListener);
    }
    
    /** Timer Listener */
    private class Listener implements ActionListener {

        @Override 
        public void actionPerformed(ActionEvent ae) {

        }
        
        }
    
    private class HockeyCourtPanel extends JPanel {
        
        private final int courtX = 700;
        private final int courtY = 900;
        private Puck puck = new Puck(350, 350);
        private Paddle paddle = new Paddle(350, 850);

        public HockeyCourtPanel() { 
            this.setPreferredSize(new Dimension(800, 1000));
            
        }
        
        @Override
            public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.blue);
            g.drawRect(50, 50, courtX, courtY); //draws the court
            g.setColor(Color.red);
            g.drawOval(325, 425, 150, 150); // draws center circle
            g.drawLine(50, 500, 750, 500); // draws center line
            g.setColor(Color.black);
            g.fillRect(325, 25, 150, 25); // draws the goals
            g.fillRect(325, 950, 150, 25);
            puck.displayPuck(g);
            paddle.displayPaddle(g);
            }
        
    }
    
}
