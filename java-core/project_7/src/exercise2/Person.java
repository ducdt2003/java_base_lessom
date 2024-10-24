package exercise2;

public class Person {
    private int id;
    private String string;
    private String address;
    private int age;

    public Person() {
    }

    public Person(int id, String string, String address, int age) {
        this.id = id;
        this.string = string;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", string='" + string + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
