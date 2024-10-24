package Demo.Abstract1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        inPutRectangle(sc, rectangle);
        rectangle.xuat();
        Square square = new Square();
        inputSquare(sc, square);
        square.xuat();
    }

    public static void inPutRectangle(Scanner sc, Rectangle rectangle){
        System.out.print(" nhập chiều dài hình chữ nhật: ");
        double length = Double.parseDouble(sc.nextLine());
        System.out.print(" nhập chiều rộng của hin chữ nhật: ");
        double width = Double.parseDouble(sc.nextLine());
        rectangle.setLength(length);
        rectangle.setWidth(width);
    }

    public static void inputSquare(Scanner sc, Square square){
        System.out.print(" nhập cạnh của hình vuông: ");
        double size = Double.parseDouble(sc.nextLine());
        square.setSize(size);
    }
}
