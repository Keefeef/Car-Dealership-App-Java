import Vehicle.Components.Engine;
import Vehicle.Components.Tyres;
import Vehicle.Vehicle;
import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VehicleTest {
    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        car = new Car("Red", 6000);
        engine = new Engine("Bugatti");
        tyres = new Tyres("Michellen");
    }
    @Test
    public void carHasColorAndPrice(){
        assertEquals("Red", car.getColor());
        assertEquals(6000, car.getPrice());
    }
    @Test
    public void engineHasMake(){
        assertEquals("Bugatti", engine.getMake());
    }
    @Test
    public void tyreHasMake(){
        assertEquals("Michellen", tyres.getMake());
    }


}
