package arratlist.arratlist2;

import arratlist.arratlist2.entities.Father;
import arratlist.arratlist2.entities.Mother;
import arratlist.arratlist2.service.FatherService;
import arratlist.arratlist2.service.MotherService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FatherService fatherService = new FatherService();
        Father father = fatherService.inputFather(sc);


        MotherService matherservice= new MotherService();
        Mother mother = matherservice.inputMother(sc);
        System.out.println(mother);
    }
}
