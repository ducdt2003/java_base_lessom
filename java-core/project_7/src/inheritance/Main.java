package inheritance;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.setName("");
        Student student = new Student("tec",13, 54);
        student.setScore(1);
        System.out.println(student);
    }
}
