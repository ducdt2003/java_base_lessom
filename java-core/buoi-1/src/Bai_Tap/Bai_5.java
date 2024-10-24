package Bai_Tap;

public class Bai_5 {
    public static void main(String[] args) {
        double x = 6.0;
        double y = 3.5;

        double thuongSo = x / y ;
        System.out.println(" thuong là " + thuongSo);
        System.out.println( " làm tròn tới 3 chữ số thập phân\t" + Math.ceil(thuongSo * 1000) / 1000);
    }
}
