package kappaleetJaLiike;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tolaakso
 */
public class TilaTesti {

    Tila tila; 
    
    @Before
    public void setUp() {
        tila = new Tila();
    }
    

     @Test
     public void aikaEtenee() {
         tila.eteneAjassa();
         assertEquals("0.01\n", tila.toString());
     }

     @Test
     public void yksiKappaleTulostetaanOikein() {
         tila.lisaaKappale();
         assertEquals("0.0\n1.0 1.0 1.0 1.0\n", tila.toString());
     }

     @Test
     public void kaksiKappalettaTulostetaanOikein() {
         tila.lisaaKappale();
         tila.lisaaKappale();
         assertEquals("0.0\n1.0 1.0 1.0 1.0\n1.0 1.0 1.0 1.0\n", tila.toString());
     }
     
     
     @Test
     public void kaksiKappalettaLiikkuvatAikaAskeleenOikein() {
         tila.lisaaKappale();
         tila.lisaaKappale();
         tila.eteneAjassa();    
         assertEquals("0.01\n1.1 1.1 1.0 1.0\n1.1 1.1 1.0 1.0"
                 + "\n", tila.toString());
     }
    
     
}
