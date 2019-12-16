package lab7.challenge.ch1;

public class Main {

    public static Thread createCorrespondingThread(int nr) {
        Thread toReturn;
        if (nr % 2 == 0) {
            toReturn = new RabbitThread(nr);
        } else {
            toReturn = new Thread(new RabitRunnable(nr));
        }
        return toReturn;
    }

    public static void main(String[] args) {
        int nr = 0;
        Thread t;

        while (nr < 10) {
            System.out.println("no" + nr);

            t = Main.createCorrespondingThread(nr);

            t.start();

            nr++;
        }
    }

}
