package lab7.challenge.ch2;

public class TransactionThread extends Thread {

    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from ,
                             BankAccount to, int amount) {

        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;

    }

    @Override
    public void  run() {
        transfer();
    }

    public void transfer() {

        synchronized (from) {
            from.withdraw(amount);
            synchronized (to) {
                to.deposit(amount);
            }
        }

        System.out.println("Name : " + name + "transferred the amount of" + amount );
    }
}
