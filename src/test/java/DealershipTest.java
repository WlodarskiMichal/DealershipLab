import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    Car car;
    DieselEngine dieselEngine;
    Gearbox gearbox;
    Tyres tyres;

    @Before
    public void setUp(){
        dealership = new Dealership("Bobs cars", 50000);
        customer = new Customer("Zsolt", 15000);
        dieselEngine = new DieselEngine("diesel engine", 200, 1.6);
        gearbox = new Gearbox("6gear", 5);
        tyres = new Tyres("Goodyear", 22);
        car = new Car("Suzuki", "Black", 10000, dieselEngine, gearbox, tyres);
    }


    @Test
    public void canSellToCustomer(){
        dealership.addVehicle(car);
        dealership.sellToCustomer(car, customer);
        assertEquals(5000, customer.getMoney(), 0.1);
        assertEquals(60000, dealership.getMoney(), 0.1);
        assertEquals(1, customer.getCollectionOfVehicles().size());
    }

}
