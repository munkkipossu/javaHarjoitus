package kappaleetJaLiike;


/*
 * Pallo - alueessa törmäilevä objekti. Symmetrinen. En ole vielä päättänyt miten
 * koko homma toimii. Todennäköisesti ympyrä-symmetrisistä kappaleista tulee
 * interace tai abstrakti luokka törmäyksien määrittelyn suhteen.
 * Riippu miten määrittelen ongelman.
 */

public class Pallo extends Kappale{

    public Pallo(){
        super(1.0,1.0,10.0,10.0,1.0,1.0);
    }
    
    public Pallo(double x, double y, double vx , double vy, double massa, double sade){
        super(x, y, vx, vy, massa, sade);
    }
    
    void liike(double aikaAskel){
        super.muutaPaikka(aikaAskel);
    }
    
    
    public void tormays(Kappale eka, Kappale toka){
        System.out.printf("Pallojen törmäys\n");
    }
    
    public String toString(){
        return super.getPaikkaX() + " " + super.getPaikkaY() + " " + super.getSade() + " " + super.getMassa();
    }
}
