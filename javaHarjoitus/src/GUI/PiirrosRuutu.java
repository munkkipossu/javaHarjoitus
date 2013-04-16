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

    private Tila tila;
    
    public PiirrosRuutu(Tila tila){
        setVisible(true);
        this.tila=tila;
        super.setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        tila.piirra(graphics);
    }
    
    public double getAika(){
        return this.tila.getAika();
    }
   
    public void eteneAjassa(){
        this.tila.eteneAjassa();
        this.tila.tormays();
    }
    
    public void lisaaKappale(){
        this.tila.lisaaKappale();
    }

}
