package kappaleetJaLiike;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tolaakso
 */
import java.awt.Graphics;
import java.io.FileWriter;

public class Tila {
    private double aikaAskel;
    private double aika;
    private Alue kentta;
    
    
    public Tila(){
        this.aikaAskel = 0.01;
        this.aika = 0.0;
        this.kentta = new Alue();
    }
    
    public void lisaaKappale(){
        this.kentta.lisaaKappale(new Pallo());
    }
    
    public void eteneAjassa(){
        this.aika += this.aikaAskel;
        this.kentta.liike(aikaAskel);
    }
    
    public double getAika(){
        return this.aika;
    }
    
    public void tallennaTila(FileWriter kirjoittaja) throws Exception {
        kirjoittaja.write(this.toString());
    }
    
    public String toString() {
        return this.aika+"\n"+this.kentta;
    }

    public void piirra(Graphics graphics){
        this.kentta.piirra(graphics);
        //System.out.println((int)(10*this.getAika()));
        //graphics.fillOval((int)(10*this.getAika()), (int)(10*this.getAika()), 10, 10);
    }
    
    public void tormays(){
        this.kentta.tarkistaReunat();
    }
    
}
