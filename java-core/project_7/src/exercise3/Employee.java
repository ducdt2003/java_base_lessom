package exercise3;

public class Employee extends Person {
    private double experience;

    public Employee(double experience) {
        this.experience = experience;
    }

    public Employee(int id, String name, int age, double experience) {
        super(id, name, age);
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                '}';
    }
}
