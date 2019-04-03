package Interfaces;

import Vehicle.Vehicle;

public interface ITrade {

    void sellVehicle(ITrade buyer, Vehicle vehicle);

    void buyVehicle(Vehicle vehicle);
}
