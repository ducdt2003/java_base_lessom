package techmaster.entities;

public class StudentBiz extends TechMastStudent {
    private double marKetingPoint;
    private double salesPoint;

    public StudentBiz() {
    }

    @Override
    public double getDiem() {
        return (2* getMarKetingPoint() + getSalesPoint()) / 3;
    }

    public StudentBiz(String name, String branch, double marKetingPoint, double salesPoint) {
        super(name, branch);
        this.marKetingPoint = marKetingPoint;
        this.salesPoint = salesPoint;
    }

    public double getMarKetingPoint() {
        return marKetingPoint;
    }

    public void setMarKetingPoint(double marKetingPoint) {
        this.marKetingPoint = marKetingPoint;
    }

    public double getSalesPoint() {
        return salesPoint;
    }

    public void setSalesPoint(double salesPoint) {
        this.salesPoint = salesPoint;
    }

    public void disPlay(){
        System.out.println(" ---Kết Quả Nhập Vào Sinh Viên Biz---");
        System.out.println(" Họ Tên: " + getName());
        System.out.println(" NGành: " + getBranch());
        System.out.println(" Điểm: " + getDiem());
        System.out.println(" Học Lực: " + getHocLuc());
    }
}
