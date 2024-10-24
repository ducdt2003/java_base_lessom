package code_sach;

public class Rectangle extends Geometry{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double acreage() {
        return getLength() * getWidth();
    }

    @Override
    public double perimeter() {
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public void displayInformation() {
        System.out.println(" chiều dài hình chữ nhật " + getLength());
        System.out.println(" chiều rộng hình chữ nhật " + getWidth());
        System.out.println(" chu vi hình chữ nhật " + perimeter());
        System.out.println(" diện tích hình chữ nhật " + acreage());
    }
}
