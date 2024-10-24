import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " nhập phần tử của hàng ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(" nhập phần tử của cột ");
        int m = Integer.parseInt(sc.nextLine());

        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                System.out.print("mời bạn nhập giá trị a[" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                System.out.println(arr[i][j] + "\t");
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(" tổng các phần tử trong mảng là " + sum);
    }
}
