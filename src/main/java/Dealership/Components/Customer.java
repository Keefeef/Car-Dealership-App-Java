package Dealership.Components;

import Interfaces.IMoney;
import Interfaces.IPerson;
import Interfaces.ITrade;
import Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer implements IPerson, IMoney, ITrade {
    private String name;
    private int money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }
    @Override
    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void addCarToOwnedVehicles(Vehicle vehicle){
        this.ownedVehicles.add(vehicle);
    }

    public void removeCarFromOwnedVehicles(Vehicle vehicle){
        this.ownedVehicles.remove(vehicle);
    }

    public void buyVehicle(Vehicle vehicle){
        addCarToOwnedVehicles(vehicle);
        this.money -= vehicle.getPrice();
    }

    public void sellVehicle(ITrade buyer, Vehicle vehicle){
        this.money += vehicle.getPrice() * 0.5;
        removeCarFromOwnedVehicles(vehicle);
        buyer.buyVehicle(vehicle);
    }

}
