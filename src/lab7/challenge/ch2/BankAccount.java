package lab7.challenge.ch2;

public class BankAccount {
    private int debit;
    private String name;

    public BankAccount( String name, int debit) {
        this.debit = debit;
        this.name = name;
    }

    public void withdraw(double amount) {
        this.longDBCall();
        this.debit -= amount;
    }

    public void deposit(double amount) {
        this.longDBCall();
        this.debit += amount;
    }

    private void longDBCall() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e ) {
            e.printStackTrace();

        }
    }

    public String toString() {
        return  "BankAccount named " + name + "contains amount : " + debit;
    }
}
