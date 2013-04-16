package kappaleetJaLiike;
import java.awt.Graphics;
/*
 * kappale 
 */
public abstract class Kappale{
    private double massa;
    private double[] paikka;
    private double[] nopeus;
    private double sade;
    private double likkuuko;
    
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
    
    public void muutaPaikka(double aikaAskel){
        this.paikka[0]=this.paikka[0]+this.nopeus[0]*aikaAskel;
        this.paikka[1]=this.paikka[1]+this.nopeus[1]*aikaAskel;
    }
    
    public double getPaikkaX(){
        return this.paikka[0];
    }

    public double getPaikkaY(){
        return this.paikka[1];
    }
    
    public double getNopeusX(){
        return this.nopeus[0];
    }

    public double getNopeusY(){
        return this.nopeus[1];
    }
    public void setPaikkaX(double x){
        this.paikka[0]=x;
    }

    public void setPaikkaY(double x){
        this.paikka[1]=x;
    }

    public void setNopeusX(double x){
        this.nopeus[0]=x;
    }
    
    public void setNopeusY(double x){
        this.nopeus[1]=x;
    }

    public double getSade(){
        return this.sade;
    }
    
    public double getMassa(){
        return this.massa;
    }

    // Liike ottaa huomioon mahdollisen törmäyksen
    abstract void liike(double aikaAskel);
    
    public abstract String toString();
    
    public abstract void piirra(Graphics graphics);
   
   
}
