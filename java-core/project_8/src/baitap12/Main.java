package baitap12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient("duc", 23, "123", 10);
        Doctor doctor = new Doctor("th", 12, "fullery", " thu tin");

        ManageHospital manageHospital1 = new ManageHospital(doctor, patient);
        System.out.println(manageHospital1);


    }
}
