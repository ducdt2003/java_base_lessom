package java_function;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        //  nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời nhập vào a ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println(" mời nhập vào b ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println(" mời nhập vào c ");
        double c = Double.parseDouble(sc.nextLine());

        String ketQua = quadraticequation(a, b, c);
        System.out.println(ketQua);
    }
    // hàm giải phương trình bậc 2
    public static String quadraticequation(double a, double b, double c){
        // nếu a = 0 thì phương trình thành phương trình bậc nhất
        if( a== 0 ){
            if ( b == 0 && c == 0){
                return "phương trình vô số nghiệm";
            }else if (b == 0 && c!= 0){
                return "phương trình vô nghiệm ";
            }else {
                return " phương trình có nghiệm " + (-c/b);
            }
        }else {
            System.out.println(" giải phương trình bậc 2 ");
            double dental = Math.pow(b, 2) - (4*a*c);
            if (dental < 0 ){
                return "phương trình bậc 2 vô nghiệm ";
            } else if (dental == 0 ) {
                double x = -b/2*a;
                return " phương trình có nghiệm kẹp ";
            }else {
                double x1 = (-b + Math.sqrt(dental) / 2*a);
                double x2 = (-b - Math.sqrt(dental) / 2*a);
                return "phương trình bậc hai có hai nghiệm phân biệt x1 = " + x1 + " x2 = " + x2;
            }

        }
    }
}
