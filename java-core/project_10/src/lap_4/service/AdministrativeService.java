package lap_4.service;

import lap_4.entities.Administrative;
import lap_4.entities.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class AdministrativeService {
    public void inputAdministrative(Scanner sc, ArrayList<Employee> employees){
        do {
            System.out.println("Nhập Mã Sô Nhân viên Hành Chính");
            String id = sc.nextLine();
            System.out.println("Nhập Tên Nhân Viên Hành chính");
            String name = sc.nextLine();
            System.out.println("Nhập Tiền Lương Của Nhân Viên Hành Chính");
            double salary = Double.parseDouble(sc.nextLine());
            Administrative administrative = new Administrative(id, name, salary);
            employees.add(administrative);
            System.out.println("Bạn có muốn tiếp tục nhập NVHC (Y||N)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")){
                System.out.println("Tiếp Tục Nhập");
            }else {
                System.out.println("Thoát Chức Năng Nhập Nhân Viên Hành Chính");
                break;
            }
        }while (true);
    }

}
