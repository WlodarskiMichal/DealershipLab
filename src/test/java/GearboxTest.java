import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {

    private Gearbox gearbox;

    @Before
    public void before(){
        gearbox = new Gearbox("Mitsubishi6Gear", 6);
    }
    @Test
    public void hasModel(){
        assertEquals("Mitsubishi6Gear", gearbox.getModel());
    }
    @Test
    public void hasNumOfGears(){
        assertEquals(6, gearbox.getNumOfGears());
    }
}
