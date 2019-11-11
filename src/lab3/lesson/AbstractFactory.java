package lab3.lesson;

public abstract class AbstractFactory {

    public abstract Pizza createPizza();

    public Pizza orderPizza(String pizzaName) {
        Pizza pizza = createPizza();

        pizza.prepare();
        pizza.cut();
        pizza.box();
        pizza.bake();

        return pizza;

    }

}
