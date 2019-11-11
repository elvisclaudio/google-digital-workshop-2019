package lab3.decorator;

public class Milk extends CondimentDecorator {
    public Milk( Bevrege bevrege) {
        super("Milk",10, bevrege);
    }
}
