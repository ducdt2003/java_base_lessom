package java_function;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập phần tử a ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println(" nhập phần tử b ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println( " chọn yêu cầu bạn muốn ( + , - , * , / )");
        char choice = sc.nextLine().charAt(0);
        switch (choice) {
            case '+':
                phepCong(a, b);
                break;
            case '-':
                phepTru(a, b);
                break;
            case '*':
                phepNhan(a, b);
                break;
            case '/':
                phepChia(a, b);
                break;
        }
    }
    public static void phepCong( double a , double b ){
        double ketQua = a + b;
        System.out.println(" tổng = " + ketQua);
    }
    public static void phepTru( double a , double b ){
        double ketQua = a - b;
        System.out.println(" hiệu = " + ketQua);
    }
    public static void phepNhan( double a , double b ){
        double ketQua = a * b;
        System.out.println(" tích = " + ketQua);
    }
    public static void phepChia( double a , double b ){
        if ( b == 0 ){
            System.out.println(" không chia hết cho 0 ");
        }else {
            double ketQua = a / b;
            System.out.println(" thương = " + ketQua);
        }
    }
}
