package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập id ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println(" nhập tên ");
        String name = sc.nextLine();
        System.out.println(" nhập địa chỉ ");
        String address = sc.nextLine();
        System.out.println(" nhập tuổi ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println(" nhập kinh nghiệm ");
        double experience = Double.parseDouble(sc.nextLine());
        System.out.println(" nhập placeWork ");
        String placeWork = sc.nextLine();
        Employee employee = new Employee();
        System.out.println(employee);
    }
}
