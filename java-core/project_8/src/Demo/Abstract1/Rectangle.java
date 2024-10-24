package Demo.Abstract1;

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
    public double perimeter() {
        return (getLength() + getWidth()) * 2;
    }
    @Override
    public double acreage() {
        return getLength() * getWidth();
    }

    @Override
    public void xuat(){
        System.out.println("\t---------------------");
        System.out.println(" chiều dài là " + getLength());
        System.out.println(" chiều rộng là " + getWidth());
        System.out.println(" chu vi là " + perimeter());
        System.out.println(" diện tích là " + acreage());
        System.out.println("\t---------------------");
    }
}
