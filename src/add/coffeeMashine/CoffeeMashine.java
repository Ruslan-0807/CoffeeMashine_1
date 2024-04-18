package add.coffeeMashine;

import add.ingradients.Coffee;
import add.ingradients.Milk;
import add.ingradients.Water;

public class CoffeeMashine {
    private Water water;
    private Milk milk;
    private Coffee coffee;

    public void setWater(Water water) {
        this.water = water;
    }
    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public void makeEspresso() {
        System.out.println("\nИзготовление Espresso...\n");
        water.pour();
        coffee.pour();


    } public void makeCappuccino() {
        System.out.println("\nИзготовление Cappuccino...\n");
        water.pour();
        coffee.pour();
        milk.pour();

    }
    public void makeLatte() {
        System.out.println("\nИзготовление Latte...\n");
        water.pour();
        coffee.pour();
        milk.pour();

    }
}

