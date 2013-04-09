/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import kappaleetJaLiike.Tila;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author mp
 */
public class PiirrosRuutu extends JPanel {

    public PiirrosRuutu(Tila uusi){
        setVisible(true);
        super.setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillOval(50, 50, 10, 10);
    }
}
