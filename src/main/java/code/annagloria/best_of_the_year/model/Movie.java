package code.annagloria.best_of_the_year.model;

public class Movie extends Media {
    private String director;

    public Movie(String director, int duration, String id, String title) {
        super(duration, id, title);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
