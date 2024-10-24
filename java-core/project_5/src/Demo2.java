import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrA [][] = new int[2][2];
        int arrB [][] = new int[2][2];
        int arrC [][] = new int[2][2];

        // vì sao arA.length = 2
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                System.out.print("arrA["+i+"]["+j+"] = ");
                arrA[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                System.out.print(arrA[i][j]+"\t");
            }
            System.out.println("\n");
        }

        System.out.println(" nhập mảng b");
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                System.out.print("arrA["+i+"]["+j+"] = ");
                arrB[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                System.out.print(arrB[i][j]+"\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {

            }
        }
    }
}
