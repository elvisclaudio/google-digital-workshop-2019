package lab3.lesson;

public class NYPizza extends Pizza {

    public NYPizza(String pizzaName) {
        super(pizzaName);
    }

    @Override
    public void prepare() {
       System.out.println("prepare");
       setDaugh("sweet NY");
       setSauce("sweet");
    }
}
