package lab3.lesson;

public class NYPizzaStore extends AbstractFactory {

    @Override
    public Pizza createPizza() {
        System.out.println("NY Style ");

        Pizza pizza = new NYPizza("NYPizza");
        return pizza;
    }
}
