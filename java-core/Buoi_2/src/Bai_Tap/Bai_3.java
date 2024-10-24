package Bai_Tap;
import java.util.Scanner;
public class Bai_3 {
    public static void main(String[] args) {
        // phương trình bậc 2 ax^2 + bx + c = 0
        // các biến cần có a, b, c, x1, x2, delta
        // bước 1. delta = b^2 -4ac
        // bước 2. kiểm tra delta
           // < 0 => vô nghiệm
           // > 0 => có hai nghiệm
           // == 0 => nghiệm kép x1 = x2 = -b/2a

        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner ( System.in );
        do {
            System.out.print( " nhập vào a = ");
            a = sc.nextInt();
        } while (a < 0);
        System.out.print( " nhập vào b = ");
        b = sc.nextInt();
        System.out.print( " nhập vào c = ");
        c = sc.nextInt();

        delta = Math.pow(b, 2) - 4*a*c;
        if (delta < 0 ){
            System.out.println( " phương trình vô nghiệm");
        } else if ( delta == 0) {
            x1 = -b/(2*a);
            System.out.println( " phương trình có nghiệm kép x1 = x2 = " + x1);
        }else {
            x1 = (-b - Math.sqrt(delta)) / ( 2 * a);
            x2 = (-b + Math.sqrt(delta)) / ( 2 * a);
            System.out.println( " phương trình có nghiệm");
            System.out.println(" x1 = " + x1);
            System.out.println(" x2 = " + x2);
        }
    }
}
