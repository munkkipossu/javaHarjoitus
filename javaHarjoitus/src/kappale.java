/*
 * kappale 
 */
public abstract class kappale extends dimensio{
    private double massa;
    private double[] paikka;
    private double[] nopeus;
    private double sade;
    
    public kappale(double x, double y, double vx, double vy, double massa, double sade){
        this.massa=massa;
        this.sade=sade;
        
        this.paikka=new double[2];
        this.paikka[0]=x;
        this.paikka[1]=y;
        
        this.nopeus=new double[2];
        this.nopeus[0]=vx;
        this.nopeus[1]=vy;
    }
    
    void muutaPaikka(kappale liikkuva, double aikaAskel){
        this.paikka[0]=this.paikka[0]+this.nopeus[0]*aikaAskel;
        this.paikka[1]=this.paikka[1]+this.nopeus[1]*aikaAskel;
    }
    
    abstract void liike(kappale liikkuva, double aikaAskel);
   
   
}
