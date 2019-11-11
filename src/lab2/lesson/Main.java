package lab2.lesson;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("F1",100, 30);
        Fighter f2 = new Fighter("F2", 100, 30);
        BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
        System.out.println("Result " + boxingMatch.fight());

        System.out.println(f2);
        System.out.println(f1.getHealth());
        System.out.println(Fighter.getNumberOfFighters());
    }
}
