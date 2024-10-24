package BTVN;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class btvn_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.print(" mời bạn nhập tên hàng của kho \t");
        String name = sc.nextLine();
        System.out.print(" mời bạn nhập vào ngày tháng năm sinh (yyyy/MM/dd)\t");
        String dateIn = sc.nextLine();
        LocalDate localDate = LocalDate.parse( dateIn, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        System.out.print(" Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss)\t");
        String dateTime = sc.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        System.out.print(" mời bạn nhập thời gian \t");
        String timeIn = sc.nextLine();
        LocalTime localTime = LocalTime.parse(timeIn, DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println(" \n\t\t\tThông tin bạn vừa nhập ");
        System.out.println(" Tên hàng bạn đã nhập là \t" + name);
        System.out.println(" Ngày tháng năm sinh của bạn là \t" + localDate);
        System.out.println(" Thời gian nhập hàng là \t" + localDateTime);
        System.out.println(" Thời gian là \t" + dateTime);
    }
}
