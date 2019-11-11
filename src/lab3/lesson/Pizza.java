package lab3.lesson;

public abstract class Pizza {

    private String name;
    private String sauce;
    private String daugh;

    public Pizza (String name) {
        this.name = name;
    }

    public void box() {
        System.out.println("Box");
    }

    public void cut() {
        System.out.println("Cut");
    }

    public void bake() {
        System.out.println("Bake");
    }

    public void setDaugh(String daugh) {
        this.daugh = daugh;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public abstract void prepare();

}
