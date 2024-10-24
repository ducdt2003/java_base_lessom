package tech_master;

public class SinhVienIT extends SinhVienTechMaster{
    private double java;
    private double html;
    private double css;

    public SinhVienIT() {
    }

    @Override
    public double getDiem() {
        return (2*getJava() + getHtml() + getCss()) / 4;
    }

    @Override
    public String getHocLuc() {
        if (getDiem() < 5) {
            return "Yếu";
        } else if (getDiem() < 6.5) {
            return "Trung bình";
        } else if (getDiem() < 7.5) {
            return "Khá";
        } else if (getDiem() <= 10) {
            return "Giỏi";
        } else {
            return "Không hợp lệ";
        }
    }

    public SinhVienIT(String hoTen, String nganh, double java, double html, double css) {
        super(hoTen, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }
    public void xuat(){
        System.out.println(" tên sinh viên là " + getHoTen());
        System.out.println(" ngành sinh viên là " + getNganh());
        System.out.println(" điểm " + getDiem());
        System.out.println(" học lực " + getHocLuc());
    }
}
