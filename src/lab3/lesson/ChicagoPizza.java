package lab3.lesson;

public  class ChicagoPizza extends  Pizza{
    public ChicagoPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("prepare");
        setDaugh("bitter Chicago");
        setSauce("bitter");
    }
}
