package arratlist.arratlist1.test;

import arratlist.arratlist1.DanhSachSinhVien;
import arratlist.arratlist1.SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        int choice = 0;
        do {
            System.out.println("MENU ------------");
            System.out.println(" VUI LÒNG CHỌN CHỨC NĂNG: ");
            System.out.println(
                    "1. Thêm sinh viên vào danh sách.\n"
                    + "2. In danh sách sinh vien in ra màn hình.\n"
                    + "3. Kiểm tra danh sách sinh viên có rỗng không.\n "
                    + "4. Lấy ra số lượng sinh viên.\n "
                    + "5. Làm rỗng danh sách sinh viên.\n"
                    + "6. kiểm tra tồn tại của sinh viên dựa trên mã sinh viên.\n"
                    + "7. Xóa sinh viên ra khỏi danh sách bằng mãng.\n"
                    + "8. Tìm kiếm tất cả sinh viên dựa trên tên được nhập vào bàn phím.\n"
                    + "9. Xuất ra danh sách inh viên có điểm từ cao đến thấp.\n"
                    + "0. Thoát chương trình "
            );
            choice = Integer.parseInt(sc.nextLine());
            if(choice == 1){
                System.out.println("Nhập Mã Sinh Viên");
                String msv = sc.nextLine();
                System.out.println("Nhập Họ Và Tên");
                String ht= sc.nextLine();
                System.out.println("Nhập Năm Sinh");
                int ns = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập Điểm Trung Bình");
                float diem = Float.parseFloat(sc.nextLine());
                SinhVien sinhVien = new SinhVien(msv, ht, ns, diem);
                danhSachSinhVien.themSinhVien(sinhVien);
            } else if (choice == 2) {
                danhSachSinhVien.inDanhSachSinhVien();
            }else if (choice == 3) {
                System.out.println(" kiểm tra danh sách rỗng " +danhSachSinhVien.kiemTraDanhSach());

            }else if (choice == 4) {
                System.out.println(" Số lượng sinh viên hiện tại " + danhSachSinhVien.soLuong());
            }else if (choice == 5) {
                danhSachSinhVien.lamRongDanhSach();
            }else if (choice == 6) {

            }else if (choice == 7) {

            }else if (choice == 8) {

            }else if (choice == 9) {

            }
        }while (choice != 0);
    }
}
