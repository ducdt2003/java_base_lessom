package lap_4.views;
import lap_4.entities.Employee;
import lap_4.service.AdministrativeService;
import lap_4.service.EmployeeService;
import lap_4.service.ManageService;
import lap_4.service.MarketingService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void displayMenu(){
        System.out.println("Các chức năng");
        System.out.println("1. Nhập và xuất danh sách nhân viên");
        System.out.println("2. Xóa nhân viên và cập nhật thông tin nhân viên");
        System.out.println("3. Tìm kiếm nhân viên theo lương");
        System.out.println("4. Sắp xếp nhân viên theo họ tên và thu nhập");
        System.out.println("5. Xuất 5 nhân viên có thu nhập cao nhất công ty");
        System.out.println("6. Thoát chương trình");
        System.out.println("Hãy nhập chức năng bạn muốn");
    }

    public void menu(Scanner sc, ArrayList<Employee> employees){
        EmployeeService employeeService = new EmployeeService();
        do {
            displayMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    AdministrativeService administrativeService = new AdministrativeService();
                    System.out.println("Nhập và xuất danh sách nhân viên");
                    diplaySelectStaff(sc, employees);
                    break;
                case 2:
                    System.out.println("Xóa nhân viên và cập nhật thông tin nhân viên");
                    employeeService.remove(sc, employees);
                    System.out.println("Danh Sách Nhân Viên Sau Khi Xóa");
                    employeeService.display(employees);
                    break;
                case 3:
                    System.out.println("Tìm kiếm nhân viên theo lương");
                    employeeService.findEmployeesBySalary(sc, employees);
                    break;
                case 4:
                    System.out.println("Sắp xếp nhân viên theo họ tên và thu nhập");
                    break;
                case 5:
                    System.out.println("Xuất 5 nhân viên có thu nhập cao nhất công ty");
                    break;
                case 6:
                    System.out.println("Thoát Chương Trình");
                    System.exit(0);
                default:
                    System.out.println("Lỗi Nhập Vào");
            }
        }while (true);
    }
    public void selectStaff(){
        System.out.println("\nDanh Sách Nhân Viên Trong Công Ty Rồng Việt");
        System.out.println("1. Nhân Viên Hành Chính");
        System.out.println("2. Nhân Viên Tiếp Thị");
        System.out.println("3. Trưởng Phòng");
        System.out.println("4. Hiện Thị Tất Cả Các Nhân viêm và trưởng Phòng vừa nhập");
        System.out.println("0. Thoát ");
        System.out.println("Hãy Chọn Nhân Viên Bạn Muốn Nhập Thông Tin");
    }
    public void diplaySelectStaff(Scanner sc, ArrayList<Employee> employees){
        EmployeeService employeeService = new EmployeeService();
        do {
            selectStaff();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    AdministrativeService administrativeService = new AdministrativeService();
                    System.out.println("\n---Hãy Nhập Nhân Viên Hành Chính---");
                    administrativeService.inputAdministrative(sc,employees);
                    break;
                case 2:
                    MarketingService marketingService = new MarketingService();
                    System.out.println("\n---Hãy Nhập Nhân Viên Tiếp Thị---");
                    marketingService.inputMarketing(sc, employees);
                    break;
                case 3:
                    ManageService manageService = new ManageService();
                    System.out.println("\n---Hãy Nhập Trưởng Phòng---");
                    manageService.inputManage(sc, employees);
                    break;
                case 4:
                    employeeService.display(employees);
                    employeeService.displayTaxForAllEmployees(employees);
                case 0:
                    System.out.println("Đã Thoát Khỏi Tính Năng Chọn Danh Sách Nhân viên");
                    menu(sc, employees);
                default:
                    System.out.println("Lỗi Nhập Vào");
            }
        }while (true);

    }
}
