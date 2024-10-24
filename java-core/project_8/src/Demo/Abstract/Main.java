package Demo.Abstract;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("khiuonf", "ha noi", 1000);
        Customer customer = new Customer(" vanw ", "nam dinh", 12498);
        employee.display();
        customer.display();
    }
}
