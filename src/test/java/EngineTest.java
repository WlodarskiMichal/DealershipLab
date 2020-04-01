import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("engine", 200);
    }

    @Test
    public void canGetName() {
        assertEquals("engine", engine.getName());
    }

    @Test
    public void canGetHorsepower(){
        assertEquals(200, engine.getHorsepower());
        }


}
