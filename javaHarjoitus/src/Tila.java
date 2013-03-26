/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tolaakso
 */
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
    
    public void eteneAjassa(){
        this.aika += this.aikaAskel;
        this.kentta.liike(aikaAskel);
    }

     public String toString() {
        return "tilan toString";
    }

}
