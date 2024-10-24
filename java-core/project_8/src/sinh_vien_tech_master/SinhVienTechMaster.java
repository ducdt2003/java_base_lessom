package sinh_vien_tech_master;

public abstract class SinhVienTechMaster {
    private String name;
    private String branch;

    public SinhVienTechMaster() {
    }

    public SinhVienTechMaster(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public abstract double getDiem();
    public String hocLuc(){
        double diem = getDiem();
        if ( getDiem() < 5 ){
            return "YẾU";
        }else if ( getDiem() >= 5 && getDiem() < 6.5){
            return "TRUNG BÌNH";
        }else if ( getDiem() >= 6.5 && getDiem() < 7.5){
            return "KHA";
        } else if (getDiem() >= 7.5 && getDiem() < 10) {
            return "GIOI";
        }else {
            return " KHONG HOP LE";
        }
    }

    public void xuat(){
        System.out.println(" name: " + getName());
        System.out.println(" branch " + getBranch());
        System.out.println(" Diem " + getDiem());
        System.out.println(" hoc luc " + hocLuc());
    }

}
