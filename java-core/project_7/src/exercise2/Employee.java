package exercise2;

public class Employee extends Person{
    private String experience;
    private String placeWork;

    public Employee() {
    }

    public Employee(int id, String string, String address, int age) {
        super(id, string, address, age);
    }

    public Employee(String experience, String placeWork) {
        this.experience = experience;
        this.placeWork = placeWork;
    }

    public Employee(int id, String string, String address, int age, String experience, String placeWork) {
        super(id, string, address, age);
        this.experience = experience;
        this.placeWork = placeWork;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                ", placeWork='" + placeWork + '\'' +
                '}';
    }
}
