package lab2.lesson;

public class BoxingMatch {

    public Fighter fighter1;
    public  Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {

       while(fighter1.getHealth() > 0) {

           fighter1.attack(fighter2);

            if (fighter2.getHealth() <= 0)
                return fighter1.getName();

           fighter2.attack(fighter1);

       }

       return fighter2.getName();

    }
}
