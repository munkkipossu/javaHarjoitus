


package kappaleetJaLiike;
import java.awt.Graphics;

/*
 * Pallo - alueessa törmäilevä objekti. Symmetrinen. En ole vielä päättänyt miten
 * koko homma toimii. Todennäköisesti ympyrä-symmetrisistä kappaleista tulee
 * interace tai abstrakti luokka törmäyksien määrittelyn suhteen.
 * Riippu miten määrittelen ongelman.
 */

public class Pallo extends Kappale{

    public Pallo(){
        super(100,50,10,10 ,1.0,40.0);
    }
    
    public Pallo(double x, double y, double vx , double vy, double massa, double sade){
        super(x, y, vx, vy, massa, sade);
    }
    
    @Override
    void liike(double aikaAskel){
        super.muutaPaikka(aikaAskel);
        System.out.println(this);
    }
    
    
    public void tormays(Kappale eka, Kappale toka){
        System.out.printf("Pallojen törmäys\n");
    }
    
    public String toString(){
        return super.getPaikkaX() + " " + super.getPaikkaY() + " " + super.getNopeusX() + " " + super.getNopeusY() + " " + super.getSade() + " " + super.getMassa();
    }

    public void piirra(Graphics graphics){
        graphics.fillOval((int)super.getPaikkaX(), (int)super.getPaikkaY(), (int)super.getSade(), (int)super.getSade());
    }
    
    

}
