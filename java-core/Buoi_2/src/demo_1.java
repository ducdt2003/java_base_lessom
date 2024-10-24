import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class demo_1 {
    public static void main(String[] args) {
/*        String s = "Hello Wold   ";
        String s1 = "   hello Wold   ";
        System.out.println(s.toUpperCase());// viết hoa
        System.out.println(s.toLowerCase());// viết thường
        System.out.println(s.trim());// xóa khoảng trắng đâu và cuối
        System.out.println(s.equals(s1));// so sánh 2 chuổi
        System.out.println(s.length());// độ dài của chuỗi
        System.out.println(s.charAt(3)); // xem ký tự số mấy
        System.out.println(s.substring(2, 5)); // xác định khoảng ký tự của chuỗi*/

/*        String name;
        int age;
        String diaChi;
        String email;

        Scanner sc = new Scanner(System.in);
        System.out.println( " nhập tên của bạn " );
        name = sc.nextLine();
        System.out.println( " nhập tuổi của bạn " );
        age = Integer.parseInt(sc.nextLine());
        System.out.println( " nhập địa chỉ của bạn " );
        diaChi = sc.nextLine();
        System.out.println( " nhập email của bạn ");
        email = sc.nextLine();*/

//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

        Scanner sc = new Scanner ( System.in );
/*        String dateString = "2024-08-05";
        LocalDate localDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Ngày hiện tại : " + localDate);

        String dateTime = "20:24:23";
        LocalTime localTime = LocalTime.parse(dateTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(" ngày giờ " + localTime);

        String dateString2 = ("2024-08-05 20:24:23");
        LocalDateTime localDateTime = LocalDateTime.parse(dateString2, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(localDateTime);*/


/*        final int THRRE_DAYS = 3;
        System.out.println( " nhập ngày giờ hiện tại yyyy-MM-dd HH:mm:ss " );
        String dateTime = sc.nextLine();
        LocalDateTime localDate = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(localDate);
        System.out.println(localDate.minusDays(THRRE_DAYS));*/


    }
}
