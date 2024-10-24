package lap_4.service;

import lap_4.entities.Employee;
import lap_4.entities.Marketing;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketingService {
    public void inputMarketing(Scanner sc, ArrayList<Employee> employees){
        do {
            System.out.println("Nhập Mã Sô Nhân viên Tiếp Thi");
            String id = sc.nextLine();
            System.out.println("Nhập Tên Nhân Viên Tiếp Thị");
            String name = sc.nextLine();
            System.out.println("Nhập Tiền Lương Của Nhân Viên Tiếp Thị");
            double salary = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập Doanh Số Bán Hàng");
            double sales = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập Hoa Hồng Kiếm Được");
            double rose = Double.parseDouble(sc.nextLine());
            Marketing marketing = new Marketing(id, name, salary, salary, rose);
            employees.add(marketing);
            System.out.println("Bạn có muốn tiếp tục nhập Nhân Viên Tiếp Thị (Y||N)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")){
                System.out.println("Tiếp Tục Nhập");
            }else {
                System.out.println("Thoát Chức Năng Nhập Nhân Viên Tiếp Thị");
                break;
            }
        }while (true);

    }
}
