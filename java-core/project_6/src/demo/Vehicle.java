package demo;

public class Vehicle {
       private double speed;
       private String name;

       public Vehicle(){
       }
    public Vehicle(double speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
