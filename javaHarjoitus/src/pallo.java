
/*
 * Pallo - alueessa törmäilevä objekti. Symmetrinen. En ole vielä päättänyt miten
 * koko homma toimii. Todennäköisesti ympyrä-symmetrisistä kappaleista tulee
 * interace tai abstrakti luokka törmäyksien määrittelyn suhteen.
 * Riippu miten määrittelen ongelman.
 */

public class pallo extends kappale{
    private double sade;
    

    public pallo(){
        super(1,1,0,0,1);
        this.sade=1;
    }
    
    public pallo(double x, double y, double vx , double vy double massa,
           double radius){
        super(x, y, vx, vy, massa);
        this.sade=radius;
    }
    
    
    public void tormays(Object eka, Object toka){
        System.out.printf("Pallojen törmäys\n");
    }
}
