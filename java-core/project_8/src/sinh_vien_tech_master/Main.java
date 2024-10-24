package sinh_vien_tech_master;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" nhập số sinh viên ");
        int n = Integer.parseInt(sc.nextLine());

        SinhVien[] sv = new SinhVien[n];
        for (int i = 0; i < sv.length; i++) {
            System.out.println(" sinh viên thứ " + (i + 1));
            System.out.println(" nhập tên sinh viên ");
            String name = sc.nextLine();
            System.out.println(" nhập ngành sinh viên ");
            String nganh = sc.nextLine();
            System.out.println(" nhập điểm sinh viên ");
            double diem = Double.parseDouble(sc.nextLine());
            SinhVien sinhVien = new SinhVien( name, nganh, diem);
            sv[i] = sinhVien;
        }

        for ( SinhVien sv3: sv) {
            sv3.xuat();
        }

    }
}
