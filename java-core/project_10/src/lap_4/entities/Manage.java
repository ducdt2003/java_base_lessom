package lap_4.entities;

public class Manage extends Employee {
    private double responsibilitySalary;

    @Override
    public double calculateIncome() {
        return getSalary() + responsibilitySalary;
    }
    public Manage() {
    }
    public Manage(String id, String name, double salary, double responsibilitySalary) {
        super(id, name, salary);
        this.responsibilitySalary = responsibilitySalary;
    }

    public double getResponsibilitySalary() {
        return responsibilitySalary;
    }

    public void setResponsibilitySalary(double responsibilitySalary) {
        this.responsibilitySalary = responsibilitySalary;
    }

    @Override
    public String toString() {
        return "Manage{" +  "id='" + getId() + '\'' +
                ", name='" + getName()+ '\'' +
                ", salary=" + getSalary() +
                ", responsibilitySalary=" + responsibilitySalary +
                '}';
    }
}
