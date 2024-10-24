package regular_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        numberTest(sc);
        stringTest(sc);
    }

    public static void numberTest(Scanner sc){
        Pattern p = Pattern.compile("^[0-9]+$");// thêm dấu + được nhập nhiều số
        while (true){
            System.out.println("Nhập: ");
            String txt = sc.nextLine();
            if (p.matcher(txt).find()){
                System.out.println("okr");
                break;
            }else {
                System.out.println("lỗi");
            }
        }
        // nhập 1 số ("^[0-9]$")
        // nhập số thoảng mái("^[0-9]+$")
        // nhập số lớn hơn 6 ký tự ("^[0-9]{6,}$")
        // nhập số đúng 6 ký tự ("^[0-9]{6}$")
        // nhập số trong khoảng 6 đế 10 ký tự ("^[0-9]{6,10}$")
    }

    public static void stringTest(Scanner sc){
        Pattern p = Pattern.compile("^[0-9]{10}$");
        while (true){
            System.out.println("Nhập: ");
            String txt = sc.nextLine();
            if (p.matcher(txt).find()){
                System.out.println("okr");
                break;
            }else {
                System.out.println("lỗi");
            }
        }
        // nhập cả số cả chữ có dấu cách("^[a-zA-Z0-9 ]+$");
        // nhập cả số cả chữ("^[a-zA-Z0-9]+$");
        // nhập chuổi ký tự cả hoa và thường ("^[a-zA-Z]+$");
        // nhập chuổi ký tự hoa ("^[A-Z]+$");
        // nhập chuổi ký tự thường ("^[A-Z]+$");
    }
}
