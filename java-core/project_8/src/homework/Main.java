package homework;

import homework.entities.TechMastStudent;
import techmaster.entities.StudentBiz;
import techmaster.entities.StudentIT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputStudentIT(sc);
        inputStudentBiz(sc);
    }

    public static void inputStudentIT(Scanner sc) {
        System.out.println("Nhập số lượng StudentIT: ");
        int student = Integer.parseInt(sc.nextLine());
        StudentIT[] arr = new StudentIT[student];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n--- Nhập Thông Tin Sinh viên IT thứ " + (i + 1) + " ---");
            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập chuyên ngành: ");
            String branch = sc.nextLine();
            System.out.print("Nhập điểm Java: ");
            double javaPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm HTML: ");
            double htmlPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm CSS: ");
            double cssPoint = Double.parseDouble(sc.nextLine());

            StudentIT studentIT = new StudentIT(name, branch, javaPoint, htmlPoint, cssPoint);
            arr[i] = studentIT;
        }

        for (StudentIT studentIT : arr) {
            studentIT.disPlay();
        }
    }

    public static void inputStudentBiz(Scanner sc) {
        System.out.println("Nhập số lượng StudentBiz: ");
        int student = Integer.parseInt(sc.nextLine());
        StudentBiz[] arr = new StudentBiz[student];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n--- Nhập Thông Tin Sinh viên Biz thứ " + (i + 1) + " ---");
            System.out.print("Nhập họ tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập chuyên ngành: ");
            String branch = sc.nextLine();
            System.out.print("Nhập điểm Marketing: ");
            double marketingPoint = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập điểm Sales: ");
            double salesPoint = Double.parseDouble(sc.nextLine());
            StudentBiz studentBiz = new StudentBiz(name, branch, marketingPoint, salesPoint);
            arr[i] = studentBiz;
        }

        System.out.println("\n--- --- ---");
        for (StudentBiz studentBiz : arr) {
            System.out.println(studentBiz);
            studentBiz.disPlay();
        }
    }
}
