package exam_15p.views;

import java.util.Scanner;

public class Menu {
    public void menu(){
        System.out.println("Nhập chức năng");
        System.out.println("1. Nhập Thông Tin");
        System.out.println("2. Hiển thị ra màn hình tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên");
        System.out.println("3. Hiển thị ra màn hình tất cả những học sinh của lớp 10A1");
    }
    public void displayMenu(Scanner sc){
        menu();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println("Nhập Thông Tin");
                break;
            case 2:
                System.out.println("2. Hiển thị ra màn hình tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên");
                break;
            case 3:
                System.out.println("3. Hiển thị ra màn hình tất cả những học sinh của lớp 10A1");
                break;
        }
    }
}
