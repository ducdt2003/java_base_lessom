package code_thoi;

public class Rectangle {
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

    public double getChuVi(){
        return (getLength() + getWidth()) * 2;
    }
    public double getDienTich(){
        return getLength() * getWidth();
    }


    public void xuatThongTin(){
        System.out.println("Hình chữ nhật:");
        System.out.println("Chiều dài: " + getWidth());
        System.out.println("Chiều rộng: " + getLength());
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Diện tích: " + getDienTich());
    }


}
