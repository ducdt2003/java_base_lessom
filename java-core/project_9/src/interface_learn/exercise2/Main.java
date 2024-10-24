package interface_learn.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập chiều dài và rộng của hình chữ nhật");
        System.out.println(" nhập chiều dài : ");
        double chieuDai = Double.parseDouble(sc.nextLine());
        System.out.println(" nhập chiều rộng : ");
        double chieuRong = Double.parseDouble(sc.nextLine());
        Rectangle rectangle = new Rectangle(chieuDai, chieuRong);
        rectangle.display();
        rectangle.calArea();

    }
}
