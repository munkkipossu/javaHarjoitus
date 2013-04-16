


package GUI;

import java.awt.*;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.*;
import kappaleetJaLiike.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    public Kayttoliittyma() {
    }

    @Override
    public void run() {
        frame = new JFrame("Harjoitustyö v0.1");
        frame.setPreferredSize(new Dimension(800, 1000));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    /* Tässä luodaan ruutu joka avautuu kun ohjelma ajetaan. Se on vielä
     * todellinen raakile, rumakin, mutta nyt toiminnallisuus on kaiken a ja o.
     */
    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(4,1);
        container.setLayout(layout);

        JButton aloitusNappi = new JButton("Start!");
        JButton loadNappi = new JButton("load!");
        JButton randomizeNappi= new JButton("randomize!");
        Tila tila=new Tila();
        
        PiirrosRuutu ruutu = new PiirrosRuutu(tila);

        Simulointi aloitus = new Simulointi(ruutu);
        aloitusNappi.addActionListener(aloitus);

        container.add(aloitusNappi);
        container.add(loadNappi);
        container.add(randomizeNappi);
        container.add(ruutu);
        
    }
  /*  
    private void luoKomponentit(Container container) {
      
        PiirrosRuutu ruutu = new PiirrosRuutu(new Tila());
        container.add(ruutu);
        container.add(luoNapit(), BorderLayout.NORTH);
    }
    */
    public JFrame getFrame() {
        return frame;
    }
    
    private JPanel luoNapit() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(new JButton("Start!"));
        panel.add(new JButton("load!"));
        panel.add(new JButton("randomize!"));
        return panel;
    }

}