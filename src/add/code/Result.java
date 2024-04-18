package add.code;

import add.coffeeMashine.CoffeeMashine;
import add.cofig.AppConfig;
import add.ingradients.Coffee;
import add.ingradients.Milk;
import add.ingradients.Water;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Result {
    public static void main(String[] args) {

//       CoffeeMashine coffeeMachine = new CoffeeMashine();
//
//        Water water = new Water();
//        Milk milk = new Milk();
//        Coffee coffee = new Coffee();
//
//        coffeeMachine.setWater(water);
//        coffeeMachine.setMilk(milk);
//        coffeeMachine.setCoffee(coffee);
//
//        coffeeMachine.makeEspresso();
//        coffeeMachine.makeCappuccino();
//        coffeeMachine.makeLatte();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CoffeeMashine coffeeMachine = context.getBean(CoffeeMashine.class);

        coffeeMachine.makeEspresso();

        coffeeMachine.makeCappuccino();

        coffeeMachine.makeLatte();
    }
}



