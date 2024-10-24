package Interface.interface_3.service;

import Interface.interface_3.entities.Rectangle;

import java.util.Scanner;

public class RectangleService implements IPolygonRectangle {
    public Rectangle inputRectanle(Scanner sc){
        System.out.println("Nhập chiều dài: ");
        double length = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chiều rộng: ");
        double width = Double.parseDouble(sc.nextLine());
        return new Rectangle(length, width);
    }

    @Override
    public void calArea() {

    }

    @Override
    public void display() {

    }

    @Override
    public void calArea(Rectangle rectangle) {
        
    }
}
