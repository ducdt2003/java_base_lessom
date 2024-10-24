package code_sach;

public class Square extends Geometry{
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }


    @Override
    public double acreage() {
        return getEdge() * getEdge();
    }

    @Override
    public double perimeter() {
        return getEdge() * 4;
    }

    @Override
    public void displayInformation() {
        System.out.println(" Cạnh của hình vuông " + getEdge());
        System.out.println(" chu vi hình vuông " + perimeter());
        System.out.println(" diện tích hình vuông " + acreage());
    }
}
