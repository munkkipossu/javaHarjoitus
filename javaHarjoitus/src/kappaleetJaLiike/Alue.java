package kappaleetJaLiike;


/*
 * Tämä luokka sisältää tilassa ilmenevät kappaaleet (pallot ja sun muut), 
 * sekä määrittelee kappaleille saalitun alueen (reunojen avulla). 
 */


import java.util.*;

public class Alue{

  //  private Reuna reunat;               // Alueen reunat. Määritellään miten määritellään.
    private List<Kappale> esineet;      // Alueella oleskelevat ja liikkuvat kappaleet

    
    // Konstruktori -- ovat vielä himean vajavaisia

    public Alue(){
        this(100.0, 100.0);
    }
    
    public Alue(double leveys, double korkeus){
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
    
    public int montakoKappaletta(){
        return this.esineet.size();
    }
    
    public void liike(double aikaAskel){
        for(Kappale esine: this.esineet){
            esine.liike(aikaAskel);
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
