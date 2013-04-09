/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViestiKuuntelija implements ActionListener {

    private JTextArea lahde;
    private JTextArea kohde;

    public ViestiKuuntelija(JTextArea lahde, JTextArea kohde) {
        this.lahde = lahde;
        this.kohde = kohde;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.kohde.setText(this.lahde.getText());
    }
}