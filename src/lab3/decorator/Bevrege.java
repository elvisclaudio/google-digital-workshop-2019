package lab3.decorator;

public abstract class Bevrege {

    private int cost;
    private String description;

    public Bevrege(String description, int cost) {
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
