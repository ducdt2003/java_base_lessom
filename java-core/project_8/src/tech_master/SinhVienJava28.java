package tech_master;

public class SinhVienJava28 extends SinhVienTechMaster {
    private double diem;

    public SinhVienJava28() {
    }

    public SinhVienJava28(String hoTen, String nganh, double diem) {
        super(hoTen, nganh);
        this.diem = diem;
    }

    @Override
    public double getDiem() {
        return diem;
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

    public void setDiem(double diem) {
        this.diem = diem;
    }


    public void xuat(){
        System.out.println(" tên sinh viên là " + getHoTen());
        System.out.println(" ngành sinh viên là " + getNganh());
        System.out.println(" điểm " + getDiem());
        System.out.println(" học lực " + getHocLuc());
    }
}
