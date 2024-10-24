package lap_2.service;

import lap_2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent(Scanner sc, ArrayList<Student> students){
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm toán ");
        double scoreMath = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Vật lý");
        double scorePhysic = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm hóa học");
        double socreChemistry = Double.parseDouble(sc.nextLine());
        Student student = new Student(name, scoreMath, scorePhysic, socreChemistry);
        students.add(student);
        return student;
    }

    public double avgScore(Student student){
        return (student.getSocreChemistry() + student.getSocreMath() + student.getSocrePhysic()) / 3;
    }

    public void rank(ArrayList<Student> students){
        int countA = 0, countB = 0, countC = 0;
        for (Student student: students) {
            if (avgScore(student) >= 8){
                countA++;
            }else if (avgScore(student) >= 6.5 && avgScore(student) < 8){
                countB++;
            }else {
                countC++;
            }
        }
        System.out.println("%A" + (countA/students.size()* 100));
        System.out.println("%B" + (countB/students.size()* 100));
        System.out.println("%C" + (countC/students.size()* 100));
    }

}
