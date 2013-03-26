/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kappaleetJaLiike;

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
public class PalloTest {
    
    Pallo pallo;
    
    @Before
    public void setUp() {
        pallo=new Pallo();
    }
    
    

    @Test
    public void pallonTulostus() {
        assertEquals("1.0 1.0 1.0 1.0", pallo.toString());
    }

    @Test
    public void pallonLiike() {
        pallo.liike(1.0);
        assertEquals("11.0 11.0 1.0 1.0", pallo.toString());
    }

}
