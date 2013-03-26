
/*
 * Tämä luokka sisältää tilassa ilmenevät kappaaleet (pallot ja sun muut), 
 * sekä määrittelee kappaleille saalitun alueen (reunojen avulla). 
 */


import java.util.*;

public class alue{
    
    // Kun alueen leveys ja korkes on määritelty, voidaan niiden avulla luoda 
    // sitä määrittävät reunat (suorakaideoliot). 
    private double leveys;
    private double korkeus;
    
    // suorakaiteet jossain titotomuodossa
    // private suorakaide reunat;
    
    // Alueella oleskelevat ja liikkuvat kappaleet
    private List<kappale> esineet;    
    public alue(){
        this.leveys=100;
        this.korkeus=100;
        this.esineet = new ArrayList<kappale>();
    }
    
    public void addKappale(kappale lisattava){
        if(! lisattava.tormaysaVaara(this.esineet)){
            add this.esineet(lisattava);
        }
    }
    
    public String toString() {
        return "woot";
    }

}
