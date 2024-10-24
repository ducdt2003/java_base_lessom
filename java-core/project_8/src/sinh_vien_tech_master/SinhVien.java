package sinh_vien_tech_master;

public class SinhVien extends SinhVienTechMaster{
    private double diem;

    public SinhVien() {
    }

    @Override
    public double getDiem() {
        return diem;
    }

    public SinhVien(String name, String branch, double diem) {
        super(name, branch);
        this.diem = diem;
    }


    public void setDiem(double diem) {
        this.diem = diem;
    }

}
