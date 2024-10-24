package enum_demo;

public class Wheather {
    private Season season;

    public Wheather(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Wheather{" +
                "season=" + season +
                '}';
    }
}
