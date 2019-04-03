package Vehicle;


import Vehicle.Components.Engine;
import Vehicle.Components.Tyres;

public abstract class Vehicle {
    private String color;
    private int price;
    private Engine engine;
    private Tyres tyres;


    public Vehicle(String color, int price){
        this.color = color;
        this.price = price;
        this.engine = null;
        this.tyres = null;
    }
    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

}
