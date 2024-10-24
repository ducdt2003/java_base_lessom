package code_sach;

import code_thoi.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        code_sach.Rectangle rectangle = new code_sach.Rectangle();
        inputRectangle(sc, rectangle);
        rectangle.displayInformation();
    }

    public static void inputRectangle(Scanner sc, code_sach.Rectangle rectangle){
        System.out.println(" nhập chiều dài hình chữ nhật");
        double length = Double.parseDouble(sc.nextLine());
        System.out.println(" nhập chiều rộng hình chữ nhật");
        double width = Double.parseDouble(sc.nextLine());
        rectangle.setLength(width);
        rectangle.setLength(length);
    }
}
