/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airhockey;

import java.awt.Dimension;
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
    
    private int courtX, courtY;
    private Timer timer;

    public AirHockeyPanel() {
        this.setPreferredSize(new Dimension(800, 1000));
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

        public HockeyCourtPanel() {
            
        }
        
}
    
}
