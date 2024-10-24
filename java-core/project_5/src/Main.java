import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
/*        int arrInt [] = new int[3];
        String[] arrString = new String[4];
        double [] arrDouble = {2, 5, 6,7};

        System.out.println( " mời bạn nhập vào 1 số nguyên ");
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++){
            System.out.println(" mời bạn nhập số thứ " + (i + 1));
            int x = Integer.parseInt(sc.nextLine());
            arr[i] = x; // gán ở vị trí thứ i sẽ có giá trị là x
            System.out.println(" số vừa nhập là " + x );
        }
        for (int i = 0; i < n ; i++){
            System.out.println("chuỗi " + i + " = " + arr[i]);
        }*/


        System.out.println(" nhập phần tử a ");
        int a = Integer.parseInt(sc.nextLine());

        int a1 = tinhGiaiThua(a);
        System.out.println(" kết quả = " + a1);

    }
    public static int tinhGiaiThua(int a){
        int giaiThua = 1;
        for (int i = 1; i <= a; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }
}