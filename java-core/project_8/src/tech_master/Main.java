package tech_master;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVienJava28 sinhVienJava28 = new SinhVienJava28();
        nhapSVJava28(sc, sinhVienJava28);
        SinhVienIT sinhVienIT = new SinhVienIT();
        nhapSVIT(sc, sinhVienIT);

    }
    public static void nhapSVJava28( Scanner sc, SinhVienJava28 sinhVienJava28){
        System.out.println(" nhập tên sinh viên ");
        String name = sc.nextLine();
        System.out.println(" nhập ngành sinh viên ");
        String nganh = sc.nextLine();
        System.out.println(" nhập điểm sinh viên ");
        double diem = Double.parseDouble(sc.nextLine());
        sinhVienJava28.setHoTen(name);
        sinhVienJava28.setNganh(nganh);
        sinhVienJava28.setDiem(diem);
        sinhVienJava28.xuat();
    }
    public static void nhapSVIT( Scanner sc,SinhVienIT sinhVienIT ){
        System.out.println(" nhập tên sinh viên ");
        String name = sc.nextLine();
        System.out.println(" nhập ngành sinh viên ");
        String nganh = sc.nextLine();
        System.out.println(" nhập điểm java ");
        double diemJava = Double.parseDouble(sc.nextLine());
        System.out.println(" nhập điểm html ");
        double diemHtml = Double.parseDouble(sc.nextLine());
        System.out.println(" nhập điểm css ");
        double diemCss = Double.parseDouble(sc.nextLine());
        sinhVienIT.setHoTen(name);
        sinhVienIT.setNganh(nganh);
        sinhVienIT.setJava(diemJava);
        sinhVienIT.setHtml(diemHtml);
        sinhVienIT.setCss(diemCss);
        sinhVienIT.xuat();
    }

}
