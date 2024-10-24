package lap_2;

import lap_2.entities.Student;
import lap_2.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        StudentService service = new StudentService();
        Student student = service.inputStudent(sc, students);
        service.rank(students);
    }
}
