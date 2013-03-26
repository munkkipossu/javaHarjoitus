
/*
 * Tämä luokka sisältää tilassa ilmenevät kappaaleet (pallot ja sun muut), 
 * sekä määrittelee kappaleille saalitun alueen (reunojen avulla). 
 */


import java.util.*;

public class Alue{
    
    // Kun alueen leveys ja korkes on määritelty, voidaan niiden avulla luoda 
    // sitä määrittävät reunat (suorakaideoliot). 
    private double leveys;
    private double korkeus;
    
    // suorakaiteet jossain titotomuodossa
    // private suorakaide reunat;
    
    // Alueella oleskelevat ja liikkuvat kappaleet
    private List<Kappale> esineet;    
   
    public Alue(){
        this.leveys=100;
        this.korkeus=100;
        this.esineet = new ArrayList<Kappale>();
    }
    
    public void addKappale(Kappale lisattava){
         this.esineet.add(lisattava);
    }
    
    public void liike(double aikaAskel){
        for(Kappale esine: this.esineet){
            esine.liike(aikaAskel);
        }
        
    }
    
    public String toString() {
        return "Alue tostring";
    }

}
