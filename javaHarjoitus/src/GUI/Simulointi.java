/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import toiminnallisuus.Ohjelma;
/**
 *
 * @author mp
 */
public class AloitusKuuntelija implements ActionListener {
    
    private boolean onkoAloitettu;
    
    public AloitusKuuntelija(){
        onkoAloitettu=false;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(!this.onkoAloitettu){
            System.out.printf("Aloitan\n");
            this.onkoAloitettu=true;
            ((JButton)ae.getSource()).setText("stop");      // Oletetaan, että kutsu tulee "buttonista", ja muutetaan napin tekstiä
            while(1!=0){System.out.printf("woowowowoo\n");}
        }
        else{
            System.out.printf("Lopetan\n");
            this.onkoAloitettu=false;
            ((JButton)ae.getSource()).setText("start");      // Oletetaan, että kutsu tulee "buttonista", ja muutetaan napin tekstiä
        }
            
    }
}
