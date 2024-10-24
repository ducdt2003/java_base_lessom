package exercise;

public class Bus extends Vehicle {
    public static final int SPEED = 20;

    private double distance;

    public Bus() {
    }

    public Bus(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public double time() {
        return getDistance() * SPEED;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "distance=" + distance +
                '}';
    }
}
