package tech_master;

public abstract class SinhVienTechMaster {
    private String hoTen;
    private String nganh;

    public SinhVienTechMaster() {
    }

    public SinhVienTechMaster(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public abstract double getDiem();
    public abstract String getHocLuc();
}
