package lab3.lesson;

public class PizzaStore {

    public static AbstractFactory createPizza(String pizzaStore) {
        if (pizzaStore == "ChicagoPizzaStore") {
            return new ChicagoPizzaStore();
        }

        if (pizzaStore == "NYPizzaStore") {
            return new NYPizzaStore();
        }

        if (pizzaStore == "LAPizza") {
            return new LAPizzaStore();
        }

        return null;
    }

}
