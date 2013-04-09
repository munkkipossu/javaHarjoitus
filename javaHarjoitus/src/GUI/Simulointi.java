/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import toiminnallisuus.Ohjelma;

/**
 *
 * @author mp
 */
public class Simulointi implements ActionListener {

    private boolean onkoAloitettu;
    private Component component;
    private PiirrosRuutu ruutu;

    public Simulointi(Component component, PiirrosRuutu ruutu) {
        onkoAloitettu = false;
        this.component = component;
        this.ruutu = ruutu;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!this.onkoAloitettu) {
            System.out.printf("Aloitan\n");
            this.onkoAloitettu = true;
            ((JButton) ae.getSource()).setText("stop");      // Oletetaan, että kutsu tulee "buttonista", ja muutetaan napin tekstiä
            
            /*
             * Tässä luodaan uusi thread, jokanka tuleva tarkoitus on 
             * päivittää aloitusruudulla olevaa piirrosRuutua siten, 
             * että paivitaPiirrosRuutu() piirtää uuden kuvan kyseisetä Tilasta,
             * ja eteneAjassa() muokkaa Tilaa. Thread loppuu, kun kyseistä 
             * nappia painetaan uudestaan. Tällöin tilan liike pysähtyy.
             */
            Thread testi = new Thread() {
                public void run() {
                    while(onkoAloitettu){
                        component.repaint();
           //             ruutu.paivitaPiirros(component);
                        ruutu.eteneAjassa();
                    //    System.out.println(ruutu.getAika());
                        try{this.sleep(1);}
                        catch(Exception e){}
                    }
                }
            };
            testi.start();
        } else {
            System.out.printf("Lopetan\n");
            this.onkoAloitettu = false;
            ((JButton) ae.getSource()).setText("start");      // Oletetaan, että kutsu tulee "buttonista", ja muutetaan napin tekstiä
        }

    }
}
