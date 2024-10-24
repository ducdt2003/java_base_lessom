package interface_learn.exercise2;

public class Square implements Polygon{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void display() {
        System.out.println(" cạnh hình vuông " + getSide());
    }

    @Override
    public void calArea() {
        double area = getSide() * getSide();
        System.out.println(area);
    }
}
