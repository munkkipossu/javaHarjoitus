package kappaleetJaLiike;


/*
 * Tämä luokka sisältää tilassa ilmenevät kappaaleet (pallot ja sun muut), 
 * sekä määrittelee kappaleille saalitun alueen (reunojen avulla). 
 */


import java.util.*;
import java.awt.Graphics;

public class Alue{

    private double[] reunat;               // Alueen reunat. Määritellään miten määritellään.
    private List<Kappale> esineet;      // Alueella oleskelevat ja liikkuvat kappaleet

    
    // Konstruktori -- ovat vielä himean vajavaisia

    public Alue(){
        this(800, 250);
    }
    
    public Alue(double leveys, double korkeus){
        this.reunat = new double[2];
        this.reunat[0]=leveys;
        this.reunat[1]=korkeus;
        this.esineet = new ArrayList<Kappale>();
    }
    
    
    public void lisaaKappale(Kappale lisattava){
         this.esineet.add(lisattava);
    }
    
    public void poistaKappale(int monesko){
        if(monesko>-1 && monesko < this.montakoKappaletta()){
            this.esineet.remove(monesko);
        } else {
        System.out.println("Osoittamaasi kappalette ei ole olemassa.");
        }
    }
    
    public Kappale getKappale(int monesko){
        if(this.montakoKappaletta() > monesko && monesko >-1){
            return esineet.get(monesko);
        }
        else
            return null;
    }
    
    public int montakoKappaletta(){
        return this.esineet.size();
    }
    
    public void liike(double aikaAskel){
        for(Kappale esine: this.esineet){
            esine.liike(aikaAskel);
        }
    }
    
    public void piirra(Graphics graphics){
        for(Kappale esine: this.esineet){
            esine.piirra(graphics);
        }
    }
    
    // Tämä pitää ehdottomasti refaktoroida jossain vaiheessa
    
    public void tarkistaReunat(){
        for(Kappale kappale: this.esineet){
            if(kappale.getPaikkaX()<kappale.getSade()){
                kappale.setPaikkaX(2*kappale.getSade()-kappale.getPaikkaX());
                kappale.setNopeusX(-1*kappale.getNopeusX());
                System.out.println("eka törmäys");
            }
            if(kappale.getPaikkaY()<kappale.getSade()){
                kappale.setPaikkaY(2*kappale.getSade()-kappale.getPaikkaY());
                kappale.setNopeusY(-1*kappale.getNopeusY());
                                System.out.println("toka törmäys");
            }
            if(kappale.getPaikkaX()>this.reunat[0]-kappale.getSade()){
                kappale.setPaikkaX(2*reunat[0]-2*kappale.getSade()-kappale.getPaikkaX());
                kappale.setNopeusX(-1*kappale.getNopeusX());
                System.out.println("kolmas törmäys");
            }
             if(kappale.getPaikkaY()>this.reunat[1]-kappale.getSade()){
                kappale.setPaikkaY(2*reunat[1]-2*kappale.getSade()-kappale.getPaikkaY());
                kappale.setNopeusY(-1*kappale.getNopeusY());
                System.out.println("neljäs törmäys");
             }
        }
    }
    
    public String toString() {
        String output="";
        for(Kappale esine: this.esineet){
            output += esine + "\n";
        }
        return output;
    }

}
