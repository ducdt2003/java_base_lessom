package Demo.Abstract2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        System.out.println(" nhập chiều dài: ");
        double chieuDai = Double.parseDouble(sc.nextLine());
        System.out.println(" nhập chiều rộng: ");
        double chieuRong = Double.parseDouble(sc.nextLine());
        hinhChuNhat.setChieuDai(chieuDai);
        hinhChuNhat.setChieuRong(chieuRong);
        hinhChuNhat.xuat();

        HinhVuong hinhVuong = new HinhVuong();
        System.out.println(" nhập cạnh : ");
        double canh = Double.parseDouble(sc.nextLine());
        hinhVuong.setCanh(canh);
        hinhVuong.xuat();
    }
}
