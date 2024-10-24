package lab_1;

import lab_1.entities.Student;
import lab_1.service.StudentSerivce;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentSerivce studentSerivce = new StudentSerivce();
        studentSerivce.inputStudent(sc, students);
    }
}
