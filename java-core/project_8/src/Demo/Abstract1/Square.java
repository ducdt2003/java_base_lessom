package Demo.Abstract1;

public class Square extends Geometry {
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double perimeter() {
        return getSize() * 4;
    }

    @Override
    public double acreage() {
        return getSize() * getSize();
    }

    @Override
    public void xuat(){
        System.out.println("\t---------------------");
        System.out.println(" cạnh là " + getSize());
        System.out.println(" chu vi là " + perimeter());
        System.out.println(" diện tích là " + acreage());
        System.out.println("\t---------------------");
    }
}
