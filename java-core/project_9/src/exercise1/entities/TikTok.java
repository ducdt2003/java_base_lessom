package exercise1.entities;

public class TikTok {
    private String idols;
    private String song;

    public TikTok() {
    }

    public TikTok(String idols, String song) {
        this.idols = idols;
        this.song = song;
    }

    public String getIdols() {
        return idols;
    }

    public void setIdols(String idols) {
        this.idols = idols;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "idols='" + idols + '\'' +
                ", song='" + song + '\'' +
                '}';
    }
}
