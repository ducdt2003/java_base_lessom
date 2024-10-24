package exercise_btvn;
import java.util.Scanner;
public class ArrayHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soDongA = 0, soCotA = 0, soDongB = 0, soCotB = 0;
        do {
            System.out.println(" \t\t--Ma Trận A--");
            System.out.print( " Nhập số dòng của ma trận A:\t");
            soDongA = Integer.parseInt(sc.nextLine());
            System.out.print( " Nhập số cột của ma trận A:\t\t");
            soCotA = Integer.parseInt(sc.nextLine());
            System.out.println(" \t\t--Ma Trận B--");
            System.out.print( " Nhập số dòng của ma trận B:\t");
            soDongB = Integer.parseInt(sc.nextLine());
            System.out.print( " Nhập số cột của ma trận B:\t\t");
            soCotB = Integer.parseInt(sc.nextLine());
            System.out.println("\n");
            if (soDongA != soDongB || soCotA != soCotB){
                System.out.println("==> không hợp lệ điều kiển số dòng và số cột bằng nhau, hãy nhập lại!");
            }
        }while (soDongA != soDongB || soCotA != soCotB);
        int [][] arrA = new int[soDongA][soCotA];
        int [][] arrB = new int[soDongA][soCotA];
        int [][] arrC = new int[soDongA][soCotA];
        System.out.println(" Nhập phần tử của ma trận A");
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(" Phần tử thứ arrA[" + i +"][" + j + "] : \t");
                arrA[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("--- Ma Trận A --- ");
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print("\t" + arrA[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println(" Nhập phần tử của ma trận B");
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) {
                System.out.print(" Phần tử thứ arrB[" + i +"][" + j + "] : \t");
                arrB[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("--- Ma Trận B --- ");
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) {
                System.out.print("\t" + arrB[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println( " tổng 2 ma trận A và B ");
        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC[i].length; j++) {
                arrC[i][j] = arrA[i][j] + arrB[i][j];
            }
        }
        System.out.println("--- Kết quả ---");
        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC[i].length; j++) {
                System.out.print( "\t" + arrC[i][j]);
            }
            System.out.println("\n");
        }
    }
}
