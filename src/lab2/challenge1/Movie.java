package lab2.challenge1;

public class Movie {
    private int yearDebut;
    private String name;
    private Actor[] actors;

    public Movie(int yearDebut, String name, Actor[] actors) {
        this.yearDebut = yearDebut;
        this.name = name;
        this.actors = actors;
    }

    public int getYearDebut() {
        return yearDebut;
    }

    public void setYearDebut(int yearDebut) {
        this.yearDebut = yearDebut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public String getActorByName(String actorName) {
        for (int i = 0; i < this.actors.length; i++) {

            if (this.actors[i].getName() == actorName) {
                return this.actors[i].getName();
            }
        }
        return null;
    }
}
