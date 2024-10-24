package exercise_arraylist;
import exercise_arraylist.entities.Member;
import exercise_arraylist.service.MemberService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();
     /*   for (int i = 0; i < 2; i++) {
            System.out.println(" Phần tử thứ " + ( i + 1) );
            MemberService memberService = new MemberService();
            Member member = memberService.inputMember(sc);
            members.add(member);
        }
        for (Member member : members) {
            System.out.println(member);
        }*/
        System.out.println(" mời bạn nhập số thành viên ");
        int n = Integer.parseInt(sc.nextLine());
    }
}
