import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
public class date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate x = LocalDate.of(2022, 4, 30);
        System.out.println(x);
        LocalTime y = LocalTime.now();
        System.out.println(y);
        LocalDateTime z = LocalDateTime.now();
        System.out.println(z);

        String dateString = "2024-08-05";
        LocalDate localDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate);


        final int THREE_DAYS = 3;
        // năm là yyyy, tháng là MM, ngày là dd, giờ là HH, phút là mm, giây là ss
        String timeString = "2024-08-05 20:39:22";
        LocalTime localTime = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(localTime);

        // In ra ngày giờ hiện tại
        System.out.println(LocalDateTime.now());

        // cho người dùng nhập giá trị ngày tháng từ bàn phím --> chuyển thành localDateTime

        System.out.println(" nhập ngày giờ theo định dạng (dd-MM-yyyy HH:mm:ss)");
        String timeInput = sc.nextLine();
        LocalDateTime u = LocalDateTime.parse(timeInput, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println(u);
    }
}
