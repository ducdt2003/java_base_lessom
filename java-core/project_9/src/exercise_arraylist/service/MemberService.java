package exercise_arraylist.service;

import exercise_arraylist.entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
   /* public Member inputMember(Scanner sc){
        System.out.println(" Nhập name: ");
        String name = sc.nextLine();
        System.out.println(" Nhập dob: ");
        String dob = sc.nextLine();
        System.out.println(" Nhập job: ");
        String job = sc.nextLine();
        return new Member(name, dob, job);
    }*/

    public ArrayList<Member> inputMember(Scanner sc,ArrayList<Member> members, int n){
        for (int i = 0; i < n; i++) {
            System.out.println("hãy nhập thông tin");
            System.out.println(" Nhập name: ");
            String name = sc.nextLine();
            System.out.println(" Nhập dob: ");
            String dob = sc.nextLine();
            System.out.println(" Nhập job: ");
            String job = sc.nextLine();
            Member member = new Member(name, dob, job);
            members.add(member);
        }
        return members;
    }
}
