package lap_4.service;

import lap_4.entities.Administrative;
import lap_4.entities.Employee;
import lap_4.views.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    public void display(ArrayList<Employee> employees){
        System.out.println("\n\t----Danh Sách Nhân Viên Công ty Rồng Việt----");
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    public void remove(Scanner sc, ArrayList<Employee> employees) {
        do {
            Employee employeeToRemove = findStaff(sc, employees);

            if (employeeToRemove != null) {
                employees.remove(employeeToRemove);
                System.out.println("Nhân Viên Đã Xóa Thành Công");

                System.out.println("Bạn có muốn tiếp tục thao tác xóa nhân viên không (Y/N)?");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    System.out.println("Tiếp Tục Tìm Và Xóa Theo ID");
                } else {
                    System.out.println("Thoát chức năng xóa");
                    break;
                }
            } else {
                System.out.println("ID không tìm thấy!");
                System.out.println("Bạn có muốn tiếp tục thao tác xóa nhân viên không (Y/N)?");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    System.out.println("Tiếp Tục Tìm Và Xóa Theo ID");
                } else {
                    System.out.println("Thoát chức năng xóa");
                    break;
                }
            }
        } while (true);
    }

    public Employee findStaff(Scanner sc,ArrayList<Employee> employees){
        System.out.println("Nhập id Nhân viên Cần xóa");
        String id = sc.nextLine();
        for (Employee employee: employees) {
            if (employee.getId().equals(id)){
                return employee;
            }
        }
        return null;
    }


    public void findEmployeesBySalary(Scanner sc, ArrayList<Employee> employees) {
        System.out.println("Nhập mức lương cần tìm:");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.println("\nDanh sách nhân viên có lương bằng " + salary + ":");
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.calculateIncome() == salary) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có nhân viên nào có lương bằng " + salary);
        }
    }

    public void displayTaxForAllEmployees(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - Thuế: " + employee.calculateTax());
        }
    }
}
