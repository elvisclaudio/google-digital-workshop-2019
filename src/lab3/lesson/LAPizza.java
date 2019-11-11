package lab3.lesson;

public class LAPizza extends Pizza {

    public LAPizza(String pizzaName) {
        super(pizzaName);
    }

    @Override
    public void prepare() {
        System.out.println("prepare");
        setDaugh("sour LA");
        setSauce("sour");
    }
}
