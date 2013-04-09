
/*
 * Jee, maini... paljon on tässä muisteltavaa. 
 */
import kappaleetJaLiike.Tila;
import java.io.FileWriter;
import GUI.*;
import javax.swing.SwingUtilities;

public class main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception  {

        System.out.printf("I'm aliiiiiiive!!!\n");
        Tila ohjelma = new Tila();
        System.out.println(ohjelma);
        ohjelma.lisaaKappale();
        System.out.println(ohjelma);

 /*       for(int i=0; i<100; i++){
            ohjelma.eteneAjassa();
            System.out.println(ohjelma);
            }
            *
            * 
*/      
        Kayttoliittyma aloitus = new Kayttoliittyma();
        SwingUtilities.invokeLater(aloitus);
    
    
    }

 }
