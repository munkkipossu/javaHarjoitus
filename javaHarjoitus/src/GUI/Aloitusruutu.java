


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


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Aloitusruutu implements Runnable {

    private JFrame frame;

    public Aloitusruutu() {
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
    
    
    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(2,1);
        container.setLayout(layout);

        JButton aloitusNappi = new JButton("Start!");
        AloitusKuuntelija aloitus = new AloitusKuuntelija();
        aloitusNappi.addActionListener(aloitus);

        container.add(aloitusNappi);
        container.add(new PiirrosRuutu());
    }
    public JFrame getFrame() {
        return frame;
    }

}