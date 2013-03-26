/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mp
 */
public class Suorakaide extends Kappale{
    private double leveys;
    private double korkeus;
    
    
    public Suorakaide(){
        super(-1.0,-1.0,0.0,0.0,0.0,1.0);
    }

    public Suorakaide(double x, double y, double vx, double vy, double massa, double sade, double leveys, double korkeus){
        super(x,y,vx,vy,massa,sade);
        this.leveys=leveys;
        this.korkeus=korkeus;
    }
    
    public void tormays(Object eka, Object toka){
        System.out.printf("Suorakaide törmäys");
    }
    
        void liike(Kappale liikkuva, double aikaAskel){
        
    }
}
