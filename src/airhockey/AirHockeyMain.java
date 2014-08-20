/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package airhockey;

import javax.swing.JFrame;

/**
 *
 * @author Nick
 */
public class AirHockeyMain {
    
      public static void main(String[] args){
        JFrame frame = new JFrame("Air Hockey");
        frame.setVisible(true);
        AirHockeyPanel hockey = new AirHockeyPanel();
        frame.setContentPane(hockey);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
