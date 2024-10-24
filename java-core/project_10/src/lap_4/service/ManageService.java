package lap_4.service;

import lap_4.entities.Employee;
import lap_4.entities.Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageService {
    public void inputManage(Scanner sc, ArrayList<Employee> employees){
        do {
            System.out.println("Nhập Mã Số Trưởng Phòng");
            String id = sc.nextLine();
            System.out.println("Nhập Tên Trưởng Phòng");
            String name = sc.nextLine();
            System.out.println("Nhập Tiền Lương Của Trưởng Phòng");
            double salary = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập Lương Trách Nhiệm Của Trưởng Phòng");
            double responsibilitySalary = Double.parseDouble(sc.nextLine());
            Manage manage = new Manage(id, name, salary, responsibilitySalary);
            employees.add(manage);
            System.out.println("Bạn có muốn tiếp tục nhập Trưởng Phòng (Y||N)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")){
                System.out.println("Tiếp Tục Nhập");
            }else {
                System.out.println("Thoát Chức Năng Nhập Trưởng Phòng");
                break;
            }
        }while (true);

    }
}
