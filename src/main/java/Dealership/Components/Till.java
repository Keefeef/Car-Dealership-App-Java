package Dealership.Components;

import Interfaces.IMoney;

public class Till implements IMoney {
    private int money;

    public Till(int money){
        this.money = money;
    }
    @Override
    public int getMoney() {
        return money;
    }

    public void addMoneyToTill(int customerMoney){
        this.money += customerMoney;
    }

    public void removeMoneyFromTill(int price){
        this.money -= price;
    }

}
