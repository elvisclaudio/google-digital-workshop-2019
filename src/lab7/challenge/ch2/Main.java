package lab7.challenge.ch2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount a = new BankAccount("1", 50);
        BankAccount b = new BankAccount("2", 60);


        TransactionThread trans = null;

        System.out.println("Before");
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < 3; i++) {



            trans = new TransactionThread("Transfer", a, b, 20);
            trans.start();
            trans.join();

        }


//        (new Thread).wait();

        System.out.println("After");
        System.out.println(a);
        System.out.println(b);

    }
}
