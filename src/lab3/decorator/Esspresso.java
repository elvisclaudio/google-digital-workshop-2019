package lab3.decorator;

public class Esspresso extends CondimentDecorator {
    public Esspresso( Bevrege bevrege) {
        super("Espresso",1, bevrege);
    }
}
