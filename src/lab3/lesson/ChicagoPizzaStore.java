package lab3.lesson;

public class ChicagoPizzaStore extends AbstractFactory {

    @Override
    public Pizza createPizza() {
        System.out.println("LA Style ");

        Pizza pizza = new ChicagoPizza("LAPizza");
        return pizza;
    }

}
