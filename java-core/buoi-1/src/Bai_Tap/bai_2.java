package Bai_Tap;

public class bai_2 {
    public static void main(String[] args) {
//        Bài 2: Tính chu vi và diện tích hình tròn khi biết bán kính của nó.
        int r = 4;
        double c = 2*r*Math.PI;
        double s = r * r * Math.PI;
        System.out.println( " chu vi hình tròn là " + Math.floor(c));
        System.out.println( " diện tích hình tròn là " + s);
    }
}
