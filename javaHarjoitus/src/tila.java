/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tolaakso
 */
public class tila {
    private double aikaAskel;
    private double aika;
    private double maxAika;
    private alue kentta;
    
    
    public tila(){
        this.aikaAskel = 0.01;
        this.aika = 0.0;
        this.kentta = new alue();
    }    
    
    public void eteneAjassa(){
        this.aika += this.aikaAskel;
        alue.liike(aikaAskel);
    }

     public String toString() {
        return "tilan toString";
    }

}
