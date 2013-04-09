package kappaleetJaLiike;


/*
 * Tämä luokka sisältää tilassa ilmenevät kappaaleet (pallot ja sun muut), 
 * sekä määrittelee kappaleille saalitun alueen (reunojen avulla). 
 */


import java.util.*;

public class Alue{

    private double[] reunat;               // Alueen reunat. Määritellään miten määritellään.
    private List<Kappale> esineet;      // Alueella oleskelevat ja liikkuvat kappaleet

    
    // Konstruktori -- ovat vielä himean vajavaisia

    public Alue(){
        this(0.01, 0.01);
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
    
    
    
    // Tämä pitää ehdottomasti refaktoroida jossain vaiheessa
    
    public void tarkistaReunat(){
        for(Kappale kappale: this.esineet){
            if(kappale.getPaikkaX()<0){
                kappale.setPaikkaX(-1*kappale.getPaikkaX());
                kappale.setNopeusX(-1*kappale.getNopeusX());
            }
            if(kappale.getPaikkaY()<0){
                kappale.setPaikkaY(-1*kappale.getPaikkaY());
                kappale.setNopeusY(-1*kappale.getNopeusY());
            }
            if(kappale.getPaikkaX()>this.reunat[0]){
                kappale.setPaikkaX(reunat[0]-(kappale.getPaikkaX()-reunat[0]));
                kappale.setNopeusX(-1*kappale.getNopeusX());
            }
            if(kappale.getPaikkaY()>this.reunat[1]){
                kappale.setPaikkaY(reunat[1]-(kappale.getPaikkaY()-reunat[1]));
                kappale.setNopeusY(-1*kappale.getNopeusY());
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
