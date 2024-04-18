package add.coffeeMashine;

import add.ingradients.Coffee;
import add.ingradients.Milk;
import add.ingradients.Water;
import org.springframework.beans.factory.annotation.Autowired;

public class CoffeeMashine {
    @Autowired
    private Water water;
    @Autowired
    private Milk milk;
    @Autowired
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

