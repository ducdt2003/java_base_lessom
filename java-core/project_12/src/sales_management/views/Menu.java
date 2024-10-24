package sales_management.views;

import sales_management.entities.Product;
import sales_management.service.ProductService;
import sales_management.untl.Untils;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    // menu chính
    public void displayMenu(){
        System.out.println("chức năng chính");
        System.out.println("1- Xem danh sách sản phẩm");
        System.out.println("2- Xem chi tiết sản phẩm");
        System.out.println("3- Thêm sản phẩm");
        System.out.println("4- Xóa sản phẩm");
        System.out.println("5- Tìm kiếm sản phẩm theo tên và id");
        System.out.println("6- Tìm kiếm theo lọc (khoảng)");
        System.out.println("Hãy chọn chức năng của bạn");
    }

    // hàm gọi ở Main
    public void inputDisplay(Scanner sc, ArrayList<Product> products){
        ProductService productService = new ProductService();
        displayMenu();
        int choice = Untils.tryInteger(sc);
        switch (choice){
            case 1:
                productService.displayProduct(sc, products);
                break;
            case 2:
                break;
            case 3:
                productService.addProduct(sc, products);
                break;
            case 4:
                productService.removeProduct(sc, products);
                break;
            case 5:
                break;
            default:
                System.out.println("Lỗi Nhập Vào");
                System.exit(0);
        }
    }

}
