package kappaleetJaLiike;

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
    private double kulma;
    private double kulmaNopeus;
    
    
    public Suorakaide(){
        super(-1.0,-1.0,0.0,0.0,0.0,1.0);   //  public Kappale(double x, double y, double vx, double vy, double massa, double sade)
        
    
    }

    public Suorakaide(double x, double y, double vx, double vy, double massa, double sade, double leveys, double korkeus){
        super(x,y,vx,vy,massa,sade);
        this.leveys=leveys;
        this.korkeus=korkeus;
        this.kulma = 0;
        this.kulmaNopeus=0;
    }
    
    public void tormays(Object eka, Object toka){
        System.out.printf("Suorakaide törmäys");
    }
    
    void liike(double aikaAskel){
        
    }
    
    public String toString(){
        return super.getPaikkaX() + " " + super.getPaikkaY();
    }
}
