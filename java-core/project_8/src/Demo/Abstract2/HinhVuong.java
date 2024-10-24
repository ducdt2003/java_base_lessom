package Demo.Abstract2;

public class HinhVuong extends HinhChuNhat {

    private double canh;

    public HinhVuong() {
    }

    public HinhVuong(double chieuDai, double chieuRong, double canh) {
        super(chieuDai, chieuRong);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getChuVi() {
        return getCanh() * 4;
    }

    public double getDienTich() {
        return getCanh() * getCanh();
    }

    @Override
    public void xuat() {
        System.out.println("Hình vuông:");
        System.out.println("Cạnh: " + getCanh());
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Diện tích: " + getDienTich());
    }
}
