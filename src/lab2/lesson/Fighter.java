package lab2.lesson;

public class Fighter {

    private String name;
    private int health;
    private int damagePerAttack;
    private static int fightersNo = 0;

    public Fighter(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        damagePerAttack = damage;
        fightersNo++;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }

    public String toString() {
        return "Name : " + name + " health :" + health + " damagePerAttack: " + damagePerAttack;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public static int getNumberOfFighters() {
        return fightersNo;
    }
}
