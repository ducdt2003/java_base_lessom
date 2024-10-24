package Bai_Tap;
import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        /*Viết chương trình tạo hai biến kiểu int number và randomNumber với:
        number được nhập vào từ bàn phím
        randomNumber được sinh ngẫu nhiên từ 1 đến 100
        So sánh hai số với nhau sử dụng toán tử 3 ngôi*/
     int x ;
     Scanner sc = new Scanner ( System.in );
        System.out.println( " nhập số nguyễn dương bất kỳ ");
        x = sc.nextInt();

        int y = (int)(Math.random() * 100) + 1;

        String resut = ( x > y ) ? "x > y " : ( x < y ) ? " x < y " : "x = y ";

        System.out.println( " số nguyên x là " + x);
        System.out.println( " số nguyên random là " + y);
        System.out.println( " kết qua so sánh " + resut);
    }
}
