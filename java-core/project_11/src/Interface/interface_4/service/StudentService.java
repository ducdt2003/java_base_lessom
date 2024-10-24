package Interface.interface_4.service;

import Interface.interface_4.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IClassification{
        public void inputStudent(Scanner sc, ArrayList<Student> students){
            do {
                System.out.println("Nhập Name: ");
                String name = sc.nextLine();
                System.out.println("Nhập age: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập marks: ");
                double marks = Double.parseDouble(sc.nextLine());
                Student student = new Student(name, age, marks);
                students.add(student);
                classify(student);
                System.out.println("Bạn muốn tiếp tục không ( Y/N )");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("Y")){
                    System.out.println(" tiếp tục nhập ");
                }else {
                    break;
                }
            }while (true);
        }


    @Override
    public void classify(Student student) {
            if (student.getMarks() < 10 && student.getMarks() >= 0) {
                if (student.getMarks() >= 8) {
                    System.out.println("học lực : A");
                    student.setClassification("Loại A");
                } else if (8 > student.getMarks() && student.getMarks() >= 6.5) {
                    System.out.println("học lực : B");
                    student.setClassification("Loại B");
                } else {
                    System.out.println("học lực : C");
                    student.setClassification("Loại C");
                }
            }else {
                System.out.println("Điễm học lực chưa được xác thực");
            }
        }


    @Override
    public void display(ArrayList<Student> students) {
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
