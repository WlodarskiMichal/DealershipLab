import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TyreTest {
    
    Tyres tyres;
    
    @Before
    public void before(){
        tyres = new Tyres("Goodyear", 17);
    }
    
    @Test
    public void canGetSize(){
        assertEquals(17, tyres.getSize());
    }

    @Test
    public void canGetModel(){
        assertEquals("Goodyear", tyres.getModel());
    }

}
