package Bai_Tap;
import java.util.Scanner;
public class Bai_2 {
    public static void main(String[] args) {
/*
        Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím, a khác 0.
*/
        Scanner scanner = new Scanner(System.in);
        double a ;
        do {
            System.out.print("Nhập giá trị của a (a khác 0): ");
             a = scanner.nextDouble();
        }while ( a < 0);
        System.out.print("Nhập giá trị của b: ");
        double b = scanner.nextDouble();
        double x = -b / a;
        System.out.println("phuong trình ax + b = 0 có nghiệm là " + x);

    }
}
