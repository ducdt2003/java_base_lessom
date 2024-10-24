package Demo.Abstract;

public class Customer extends Person{
    private int balance;

    public int getBalance() {
        return balance;
    }

    public Customer() {
    }

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display(){
        System.out.println("name: " + super.getName());
        System.out.println("add: " + super.getAddress());
        System.out.println("salary: " + getBalance());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "balance=" + balance +
                '}';
    }
}
