package lab2.challenge1;

public class Main {
    public static void main(String[] args) {

        //prizes
        Prize p1 = new Prize("Oscar1",2000);
        Prize p2 = new Prize("Oscar2",2001);
        Prize p3 = new Prize("Oscar3",2002);
        Prize p4 = new Prize("Oscar4",2003);


        //actors
        Prize[] listP1 = new Prize[2];

        listP1[0] = p1;
        listP1[1] = p2;

        Actor a1 = new Actor("A1", 21, listP1);
        Actor a2 = new Actor("A2", 23, new Prize[] {p3});
        Actor a3 = new Actor("A3", 25, new Prize[] {p2, p3, p4});
        Actor noPrizes = new Actor("ActorWithNoPrizes", 27, new Prize[]{});

        Movie m1 = new Movie(2000, "M1", new Actor[] {a1, a2});
        Movie m2 = new Movie(2002, "M2", new Actor[] {a3});

        Studio s1 = new Studio("S1", new Movie[] {m1, m2});
        Studio s2 = new Studio("S1", new Movie[] {m1});

        Studio[] studios = new Studio[]{s1, s2};

        for (int i = 0; i < studios.length;i++) {
            if (studios[i].getNoMovies() > 1) {
                System.out.println(studios[i].getName());
            }

            Movie f = studios[i].getFilmByActor("A1");
            if (f!= null) {
                System.out.println(studios[i] + " contains actor");
            }

        }

    }
}
