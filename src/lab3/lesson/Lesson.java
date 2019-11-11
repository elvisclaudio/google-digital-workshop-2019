package lab3.lesson;

public class Lesson {

    public static void main(String[] args) {
        try {

            AbstractFactory store =  PizzaStore.createPizza("LaPizzaStore");

            Pizza pizza = store.orderPizza("Caltzone");
        } catch (Throwable e) {

            System.out.print(1 + "" + e);
        }


    }
}
