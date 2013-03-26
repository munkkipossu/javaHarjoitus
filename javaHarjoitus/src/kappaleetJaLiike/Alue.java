package kappaleetJaLiike;


/*
 * Tämä luokka sisältää tilassa ilmenevät kappaaleet (pallot ja sun muut), 
 * sekä määrittelee kappaleille saalitun alueen (reunojen avulla). 
 */


import java.util.*;

public class Alue{

    
    private final static double REUNAN_PAKSUUS=5.0;
    private double leveys;
    private double korkeus;

    
    // suorakaiteet jossain titotomuodossa
    private List<Suorakaide> reunat;

    // Alueella oleskelevat ja liikkuvat kappaleet
    private List<Kappale> esineet; 
   
    
    // Konstruktori -- ovat vielä himean vajavaisia

    public Alue(){
        this(100.0, 100.0);
    }
    
    public Alue(double leveys, double korkeus){
        this.leveys=leveys;
        this.korkeus=korkeus;
        this.esineet = new ArrayList<Kappale>();
        this.reunat = new ArrayList<Suorakaide>();
        this.reunat.add(Suorakaide(0.5*leveys, korkeus + 0.5*REUNAN_PAKSUUS));
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
