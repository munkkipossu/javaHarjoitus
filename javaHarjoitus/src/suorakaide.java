/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mp
 */
public class suorakaide extends kappale{
    private double leveys;
    private double korkeus;
    
    
    public suorakaide(){
        super(-1,-1,0,0,0);
    }

    public suorakaide(double x, double y, double vx, double vy, double massa, double leveys, double korkeus){
        super(x,y,vx,vy,massa);
        this.leveys=leveys;
        this.korkeus=korkeus;
    }
    
    public void tormays(Object eka, Object toka){
        System.out.printf("Suorakaide törmäys");
    }
}
