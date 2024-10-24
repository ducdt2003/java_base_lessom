package lesson_1;

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số nguyên bất kỳ ");
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        for (int i = 0 ; i < n; i++){
            System.out.println(" mời bạn nhập số thứ " + (i + 1));
            int x = Integer.parseInt(sc.nextLine());
            arr[i] = x; // gán ở vị trí thứ i sẽ có giá trị là x
            if(arr[i] % 2 ==0){
                arr[i]++;
            }
        }
        System.out.println(" mảng ban đầu ");
        for (int i = 0 ; i < n ; i++){
            System.out.println("mảng vừa nhập là arr[" + (i + 1) + "]");
        }
        System.out.println("mảng sau khi tăng");
        for (int i = 0 ; i < n ; i++){
            System.out.println("các số chẵn tăng lên 1 đơn vị là arr[" + arr[i] + "]");
        }
    }
}
