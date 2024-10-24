package interface_learn.exercise2;

public class Rectangle implements Polygon {
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
    public void calArea() {
        double area = getLength() * getWidth();
        System.out.println(area);
    }
    @Override
    public void display() {
        System.out.println(" chiều dài " + getLength());
        System.out.println(" chiều rộng " + getWidth());
    }
}
