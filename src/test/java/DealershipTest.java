import Dealership.Components.Customer;
import Dealership.Components.Dealer;
import Dealership.Components.Till;
import Dealership.Dealership;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;
import Vehicle.Car;

import static junit.framework.TestCase.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Customer customer;
    Dealer dealer;
    Till till;

    @Before
    public void before(){
        dealership = new Dealership();
        car = new Car("Green", 5000);
        customer = new Customer("Bob", 7000);
        dealer = new Dealer("James");
        till = new Till(10000);
    }
    @Test
    public void hasCarStock(){
        assertEquals(0, dealership.getCarStock().size());
    }
    @Test
    public void canAddCar(){
        dealership.addCar(car);
        assertEquals(1, dealership.getCarStock().size());
    }
    @Test
    public void customerOwnedCars(){
        assertEquals(0, customer.getOwnedVehicles().size());
    }
    @Test
    public void customerCanBuyCar(){
        dealership.addCar(car);
        dealership.sellVehicle(customer, car);
        assertEquals(0, dealership.getCarStock().size());
        assertEquals(2000, customer.getMoney());
        assertEquals(5000, dealership.getMoney());
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void customerCanSellCar(){
        customer.addCarToOwnedVehicles(car);
        dealership.addMoneyToTill(5001);
        customer.sellVehicle(dealership, car);
        assertEquals(0, customer.getOwnedVehicles().size());
        assertEquals(9500, customer.getMoney());
        assertEquals(1, dealership.getMoney());
        assertEquals(1, dealership.getCarStock().size());
    }
}
