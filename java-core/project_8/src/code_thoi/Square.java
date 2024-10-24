package code_thoi;

public class Square extends Rectangle{
    private double size;

    public Square() {
    }

    public Square(double length, double width, double size) {
        super(length, width);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getChuVi() {
        return getSize() * 4;
    }

    public double getDienTich() {
        return getSize() * getSize();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
    }
}
