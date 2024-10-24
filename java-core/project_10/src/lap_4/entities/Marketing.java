package lap_4.entities;

public class Marketing extends Employee {
    private double sales;
    private double rose;

    public Marketing() {
    }

    public Marketing(String id, String name, double salary, double sales, double rose) {
        super(id, name, salary);
        this.sales = sales;
        this.rose = rose;
    }

    @Override
    public double calculateIncome() {
        return getSalary() + (sales * rose);
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRose() {
        return rose;
    }

    public void setRose(double rose) {
        this.rose = rose;
    }

    @Override
    public String toString() {
        return "Marketing{" + "id='" + getId() + '\'' +
                ", name='" + getName()+ '\'' +
                ", salary=" + getSalary() +
                ", sales=" + sales +
                ", rose=" + rose +
                '}';
    }
}
