import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CarTest {
    private Car car;
    private DieselEngine dieselEngine;
    private Gearbox gearbox;
    private Tyres tyres;

    @Before
    public void before(){
        dieselEngine = new DieselEngine("diesel engine", 200, 1.6);
        gearbox = new Gearbox("6gear", 5);
        tyres = new Tyres("Goodyear", 22);
        car = new Car("Suzuki", "Black", 10000, dieselEngine, gearbox, tyres);
    }

    @Test
    public void hasMake(){
        assertEquals("Suzuki", car.getMake());
    }

    @Test
    public void hasGearbox(){
        assertEquals(gearbox, car.getGearbox());
    }

    @Test
    public void hasNumOfGears(){
        assertEquals(5, car.getGearbox().getNumOfGears());
    }

    @Test
    public void hasHorsepower(){
        assertEquals(200, car.getEngine().getHorsepower());
    }

    @Test
    public void canReadPriceForDamage(){
        car.damage(1);
        assertEquals(9000, car.getPrice(), 0.1);
    }
}
