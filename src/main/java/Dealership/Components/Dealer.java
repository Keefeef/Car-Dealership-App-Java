package Dealership.Components;

import Interfaces.IPerson;

public class Dealer implements IPerson {
    private String name;

    public Dealer(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

}
