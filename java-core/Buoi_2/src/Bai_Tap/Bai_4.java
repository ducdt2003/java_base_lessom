package Bai_Tap;
import java.time.Year;
import java.util.Scanner;
public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào ngày tháng năm sinh theo định dạng nhất định (ví dụ: dd/MM/yyyy)
        System.out.print("Nhập vào ngày tháng năm sinh (định dạng dd/MM/yyyy): ");
        String birthDate = scanner.nextLine();

        // Tách năm sinh từ chuỗi nhập vào
        String[] dateParts = birthDate.split("/");
        int birthYear = Integer.parseInt(dateParts[2]);

        // Lấy năm hiện tại
        int currentYear = Year.now().getValue();

        // Tính tuổi
        int age = currentYear - birthYear;

        // In ra tuổi của người đó
        System.out.println("Tuổi của bạn là: " + age);

        scanner.close();
    }
}
