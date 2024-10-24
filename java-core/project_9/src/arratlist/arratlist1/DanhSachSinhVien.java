package arratlist.arratlist1;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    public void inDanhSachSinhVien(){
        for ( SinhVien sinhVien: danhSach) {
            System.out.println(sinhVien);
        }
    }
    public boolean kiemTraDanhSach(){
        return this.danhSach.isEmpty();
    }
    public int soLuong(){
        return this.danhSach.size();
    }
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTai(SinhVien sv ){
        return this.danhSach.contains(sv);
    }

    public boolean xoaSinhVien(SinhVien sv ){
        return this.danhSach.remove(sv);
    }

    public void timSinhVien(String ten ){
        for ( SinhVien sinhVien : danhSach) {
            if(sinhVien.getHoVaTen().indexOf(ten) >= 0){
                System.out.println(sinhVien);
            }
        }
    }
}
