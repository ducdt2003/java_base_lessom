package arratlist.lab_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> familyMembers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin cho thành viên " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Date of Birth: ");
            String dob = scanner.nextLine();
            System.out.print("Job: ");
            String job = scanner.nextLine();
            Member member = new Member(id, name, dob, job);
            familyMembers.add(member);
        }

        System.out.println("\nThông tin các thành viên trong gia đình:");
        for (Member member : familyMembers) {
            System.out.println(member);
        }
    }
}

