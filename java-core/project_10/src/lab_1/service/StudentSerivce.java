package lab_1.service;


import lab_1.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSerivce {
    public void inputStudent(Scanner sc, ArrayList<Student> students){
        do {
            System.out.println("name: ");
            String name = sc.nextLine();
            System.out.println("add: ");
            String add = sc.nextLine();
            Student student = new Student(name, add);
            students.add(student);

            System.out.println("Bạn có muốn tiếp tục không (Y||N) ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")){
                System.out.println("Tiếp tục nhập sinh viên");
            }else {
                for (Student student1 : students) {
                    System.out.println(student1);
                }
                break;
            }
        }while (true);
    }
}
