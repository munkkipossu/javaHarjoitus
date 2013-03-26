
/*
 * Pallo - alueessa törmäilevä objekti. Symmetrinen. En ole vielä päättänyt miten
 * koko homma toimii. Todennäköisesti ympyrä-symmetrisistä kappaleista tulee
 * interace tai abstrakti luokka törmäyksien määrittelyn suhteen.
 * Riippu miten määrittelen ongelman.
 */

public class pallo extends kappale{

    public pallo(){
        super(-1.0,-1.0,0.0,0.0,1.0,1.0);
    }
    
    public pallo(double x, double y, double vx , double vy, double massa, double sade){
        super(x, y, vx, vy, massa, sade);
    }
    
    void liike(kappale liikkuva, double aikaAskel){
        
    }
    
    
    public void tormays(Object eka, Object toka){
        System.out.printf("Pallojen törmäys\n");
    }
}
