package lab2.challenge1;

public class Studio {
    private String name;
    private Movie[] movies;

    public Studio(String name, Movie[] movies) {
        this.name = name;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public int getNoMovies() {
        return movies.length;
    }

    public Movie getFilmByActor(String actorName) {
        for (int i=0; i < movies.length; i++) {
            if (movies[i].getActorByName(actorName) != null) {
                return movies[i];
            }
        }
        return null;
    }
}
