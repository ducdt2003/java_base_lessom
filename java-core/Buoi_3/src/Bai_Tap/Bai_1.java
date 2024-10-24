package Bai_Tap;

import java.util.Random;
import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        Random random = new Random();
        int rdNumber = random.nextInt(100);
        System.out.println(" số ngẫu nhiên là " + rdNumber);

        int a;
        do {
            System.out.println(" Nhập Số nguyên a bất kỳ");
            a =sc.nextInt();
        }while (a < 0);

        if (a > rdNumber){
            System.out.println(" lớn hơn rồi ");
        } else if (a < rdNumber) {
            System.out.println(" bé hơn rồi ");
        }else {
            System.out.println(" bạn nhập bằng ");
        }
    }
}
