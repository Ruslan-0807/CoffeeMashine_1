package add.cofig;

import add.coffeeMashine.CoffeeMashine;
import add.ingradients.Coffee;
import add.ingradients.Milk;
import add.ingradients.Water;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class AppConfig {
  @Bean
    public CoffeeMashine coffeeMachine(Water water, Milk milk, Coffee coffee) {

       CoffeeMashine coffeeMachine = new CoffeeMashine();

        coffeeMachine.setWater(water);
        coffeeMachine.setMilk(milk);
        coffeeMachine.setCoffee(coffee);
        return coffeeMachine;
    }
    @Bean public Water water() {
        return new Water();
    }
    @Bean public Milk milk() {
        return new Milk();
    }
    @Bean
    public Coffee coffee() {
        return new Coffee();
    }
}

