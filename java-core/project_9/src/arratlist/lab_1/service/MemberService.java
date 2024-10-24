package arratlist.lab_1.service;

import arratlist.lab_1.entities.Member;

import java.util.Scanner;

public class MemberService {
    public Member inputMember(Scanner sc) {
        System.out.println(" nhập số member ");
        int choice = Integer.parseInt(sc.nextLine());
        do {
            System.out.println("ID: ");
            String id = sc.nextLine();
            System.out.println("NAME: ");
            String name = sc.nextLine();
            System.out.println("DOB: ");
            String dob = sc.nextLine();
            System.out.println("JOB: ");
            String job = sc.nextLine();
            return new Member(id, name, dob, job);
        }while (choice < 2 );
    }
}
