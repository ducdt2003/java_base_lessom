import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();
        animal.setName("name");
        System.out.println(animal.getName());
        animal.setAge(29);
        System.out.println(animal.getAge());
    }
}