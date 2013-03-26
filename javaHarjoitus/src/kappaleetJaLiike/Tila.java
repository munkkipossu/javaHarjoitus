package kappaleetJaLiike;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tolaakso
 */

import java.io.FileWriter;

public class Tila {
    private double aikaAskel;
    private double aika;
    private double maxAika;
    private Alue kentta;
    
    
    public Tila(){
        this.aikaAskel = 0.01;
        this.aika = 0.0;
        this.kentta = new Alue();
    }    
    
    public void lisaaKappale(){
        this.kentta.addKappale(new Pallo());
    }
    
    public void eteneAjassa(){
        this.aika += this.aikaAskel;
        this.kentta.liike(aikaAskel);
    }
    
    public void tallennaTila(FileWriter kirjoittaja) throws Exception {
        kirjoittaja.write(this.toString());
    }
    
    public String toString() {
        return this.aika+"\n"+this.kentta;
    }

}
