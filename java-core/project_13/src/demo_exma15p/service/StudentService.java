package demo_exma15p.service;

import demo_exma15p.entities.Student;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public void inputStudent(Scanner sc, ArrayList<Student> students){
        System.out.println("Nhập tên học sinh: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh của học sinh: ");
        String date = sc.nextLine();
        System.out.println("Nhập quê quán của học sinh: ");
        String countryside = sc.nextLine();

    }
}
