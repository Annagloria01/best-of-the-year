package code.annagloria.best_of_the_year.model;

public class Song extends Media {

    private String genre;

    public Song(String genre, int duration, String id, String title) {
        super(duration, id, title);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
