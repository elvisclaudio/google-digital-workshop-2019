package lab3.lesson;

public class LAPizzaStore extends AbstractFactory {

    @Override
    public Pizza createPizza() {
        System.out.println("LA Style ");

        Pizza pizza = new LAPizza("LAPizza");
        return pizza;
    }

}
