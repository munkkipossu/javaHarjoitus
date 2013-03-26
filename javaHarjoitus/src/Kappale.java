/*
 * kappale 
 */
public abstract class Kappale extends Dimensio{
    private double massa;
    private double[] paikka;
    private double[] nopeus;
    private double sade;
    
    public Kappale(double x, double y, double vx, double vy, double massa, double sade){
        this.massa=massa;
        this.sade=sade;
        
        this.paikka=new double[2];
        this.paikka[0]=x;
        this.paikka[1]=y;
        
        this.nopeus=new double[2];
        this.nopeus[0]=vx;
        this.nopeus[1]=vy;
    }
    
    void muutaPaikka(Kappale liikkuva, double aikaAskel){
        this.paikka[0]=this.paikka[0]+this.nopeus[0]*aikaAskel;
        this.paikka[1]=this.paikka[1]+this.nopeus[1]*aikaAskel;
    }
    
    abstract void liike(Kappale liikkuva, double aikaAskel);
   
   
}
