import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        String name;
        int age;

        String email;
        String diaChi;

        Scanner sc = new Scanner ( System.in );

        System.out.print( " nhập tên của bạn ");
        name = sc.nextLine();
        System.out.print(" nhập tuổi ");
        age = Integer.parseInt(sc.nextLine());
        // xữ lý nuốt lệnh
//        double scor = double.parseDouble(sc.nextLine())
        System.out.print( " nhập email của bạn ");
        email = sc.nextLine();
        diaChi = sc.nextLine();

        System.out.print( " nhập địa chỉ của bạn ");
    }
}
