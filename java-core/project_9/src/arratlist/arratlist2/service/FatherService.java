package arratlist.arratlist2.service;

import arratlist.arratlist2.entities.Father;
import arratlist.arratlist2.utils.Sex;

import java.util.ArrayList;
import java.util.Scanner;

public class FatherService {
    ArrayList<Father> arrayList;

    public FatherService() {
    }

    public FatherService(ArrayList<Father> arrayList) {
        this.arrayList = arrayList;
    }

    public Father inputFather(Scanner sc){
        System.out.println(" nhập ID ");
        String id = sc.nextLine();
        System.out.println(" nhập name ");
        String name = sc.nextLine();
        System.out.println(" nhập công việc ");
        String job = sc.nextLine();
        System.out.println(" nhập Chiều cao ");
        double height = Double.parseDouble(sc.nextLine());
        return new Father(id, name, Sex.MALE ,job, height);
    }
    public void addFatther(Father father){
        this.arrayList.add(father);
    }

    public void displayFatherServuce(){
        for ( Father father: arrayList) {
            System.out.println(father);
        }
    }
}
