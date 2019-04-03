package Dealership;

import Dealership.Components.Customer;
import Dealership.Components.Dealer;
import Dealership.Components.Till;
import Interfaces.ITrade;
import Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership implements ITrade {
    private ArrayList<Vehicle> carStock;
    private Till till;
    private Dealer dealer;
    private Customer customer;

    public Dealership(){
        this.carStock = new ArrayList<>();
        this.till = new Till(0);
    }

    public int getMoney(){
        return this.till.getMoney();
    }
    public ArrayList<Vehicle> getCarStock() {
        return carStock;
    }

    public void addMoneyToTill(int money){
        this.till.addMoneyToTill(money);
    }


    public void addCar(Vehicle vehicle){
        carStock.add(vehicle);
    }
    public void sellVehicle(ITrade buyer, Vehicle vehicle){
        buyer.buyVehicle(vehicle);
        this.till.addMoneyToTill(vehicle.getPrice());
        this.carStock.remove(vehicle);
    }

    public void buyVehicle(Vehicle vehicle){
        this.till.removeMoneyFromTill(vehicle.getPrice());
        addCar(vehicle);
    }

}
