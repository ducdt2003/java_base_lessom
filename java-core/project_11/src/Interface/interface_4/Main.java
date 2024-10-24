package Interface.interface_4;

import Interface.interface_4.entities.Student;
import Interface.interface_4.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentService service = new StudentService();
        service.inputStudent(sc, students);
        service.display(students);
    }
}
