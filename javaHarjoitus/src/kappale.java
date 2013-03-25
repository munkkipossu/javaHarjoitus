/*
 * kappale 
 */
public abstract class kappale extends dimensio{
    private double massa;
    private double[] paikka;
    private double[] nopeus;
    
    public kappale(double x, double y, double vx, double vy, double massa){
        this.massa=massa;
        
        this.paikka=new double[2];
        this.paikka[0]=x;
        this.paikka[1]=y;
        
        this.nopeus=new double[2];
        this.nopeus[0]=vx;
        this.nopeus[1]=vy;
    }
   
   
}
