

package kappaleetJaLiike;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlueTest {
    
    Alue alue;
    
    @Before
    public void setUp() {
        alue = new Alue();
        alue.lisaaKappale(new Pallo());
    }
    
    
    @Test
    public void montakoKappaletta() {
        Alue alue2 = new Alue();
        assertEquals("0",""+alue2.montakoKappaletta());  
    }
    
    @Test
    public void kappaleenLuontiAlueeseen() {
        assertEquals("1",""+alue.montakoKappaletta());  
    }
    
    @Test
    public void kappaleenPoistoAlueesta(){
        alue.poistaKappale(0);
        assertEquals("0", ""+alue.montakoKappaletta());
    }

    @Test
    public void olemattomanKappaleenPoistoAlueesta(){
        alue.poistaKappale(124);
        assertEquals("1", ""+alue.montakoKappaletta());
    }
    
    @Test
    public void kappaleenTulostusAlueessa() {
        assertEquals("1.0 1.0 1.0 1.0\n",alue.toString());  
    }
    
    

}
