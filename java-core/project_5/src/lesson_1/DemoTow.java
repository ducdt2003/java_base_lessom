package lesson_1;

import java.util.Scanner;

public class DemoTow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[2][3];// hàng 2 cột 3
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println(" mời bạn nhập giá trị a[" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println(" mời bạn nhập giá trị a[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }
}
