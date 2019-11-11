package lab3.decorator;

public abstract class CondimentDecorator extends Bevrege{

    private Bevrege bevrege;

    public CondimentDecorator(String description, int cost, Bevrege bevrege) {

        super(description,cost);
        this.bevrege = bevrege;

    }
}
