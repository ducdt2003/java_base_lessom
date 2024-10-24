import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*        String s = "Techmaster";
        String s1 = "TechmasteR";
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.charAt(1));

        // cắt ký từ sau ký tự n - 1
        System.out.println(s.substring(2, 4));

        String s2 = s.substring(2, 4);
        System.out.println(s2);
        System.out.println(s.contains(s2));*/

        // in dấu \
//        String s = " hello \\";
//        System.out.println(s);

        Scanner sc = new Scanner ( System.in );
        System.out.println(" nhập tên ");
        int name = Integer.parseInt(sc.nextLine());
        System.out.printf("số học sinh  %d có là ",name);

    }
}