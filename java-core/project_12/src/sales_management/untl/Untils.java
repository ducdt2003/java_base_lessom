package sales_management.untl;

import java.util.Scanner;

public class Untils {
    public static int tryInteger(Scanner sc){
        do {
            try {
                int n = Integer.parseInt(sc.nextLine());
                return n;
            }catch (Exception e){
                System.out.println("Nhập số nguyễn bằng số không nhập bằng chữ");
            }
        }while (true);
    }
    public static double tryDouble(Scanner sc){
        do {
            try {
                int n = Integer.parseInt(sc.nextLine());
                return n;
            }catch (Exception e){
                System.out.println("Nhập số thực bằng số không nhập bằng chữ");
            }
        }while (true);
    }
}
