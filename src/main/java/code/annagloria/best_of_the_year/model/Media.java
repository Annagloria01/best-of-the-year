package code.annagloria.best_of_the_year.model;

public class Media {

    private String id;
    private String title;
    private int duration;

    public Media(int duration, String id, String title) {
        this.duration = duration;
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
