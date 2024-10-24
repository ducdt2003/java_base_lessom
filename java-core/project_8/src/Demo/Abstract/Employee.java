package Demo.Abstract;

public class Employee extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display(){
        System.out.println("name: " + super.getName());
        System.out.println("add: " + super.getAddress());
        System.out.println("salary: " + getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
