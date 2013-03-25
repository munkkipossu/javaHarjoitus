/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mp
 */
public abstract class kappale implements physics{
    private double massa;
    private double[] paikka;
    private double[] nopeus;
    private double sade;
    
    abstract void tormays(kappale eka, kappale toka);
    
}
