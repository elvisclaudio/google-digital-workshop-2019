package lab7.challenge.ch1;

public class RabitRunnable implements Runnable {
    private int nr;
    public RabitRunnable(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabit no" + nr + "is running");
    }
}
