package lap_4.entities;

public class Administrative extends Employee{

    @Override
    public double calculateIncome() {
        return getSalary();
    }

    public Administrative() {
    }

    public Administrative(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return "Administrative{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
