package arratlist.arratlist2.service;

import arratlist.arratlist2.entities.Father;
import arratlist.arratlist2.entities.Mother;
import arratlist.arratlist2.utils.Sex;

import java.util.Scanner;

public class MotherService {
    public Mother inputMother(Scanner sc){
        System.out.println(" nhập ID ");
        String id = sc.nextLine();
        System.out.println(" nhập name ");
        String name = sc.nextLine();
        System.out.println(" nhập công việc ");
        String job = sc.nextLine();
        System.out.println(" nhập Cân Nặng ");
        double weight = Double.parseDouble(sc.nextLine());
        return new Mother(id, name, Sex.FEMALE, job, weight);
    }
}
