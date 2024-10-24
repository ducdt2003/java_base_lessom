package arratlist.lab_1.entities;

import arratlist.lab_1.entities.Member;

import java.util.ArrayList;

public class Family{
   private ArrayList<Member> list;

    public Family() {
        this.list = new ArrayList<Member>();// người dùng k truyền vào arryLisst sẻ tự tạo
    }
    public Family(ArrayList<Member> list) {
        this.list = list;
    }

    public void addMember(Member member){
        this.list.add(member);
    }
    public void displayMember(){
        for (Member member : list) {
            System.out.println(member);
        }
    }
}
