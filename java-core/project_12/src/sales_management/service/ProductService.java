package sales_management.service;

import sales_management.entities.Product;
import sales_management.untl.Untils;
import sales_management.views.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public void addProduct(Scanner sc, ArrayList<Product> products){
        do {
            System.out.println("Nhập số lượng sản phẩm ");
            int quantity = Untils.tryInteger(sc);
            System.out.println("Nhập tên sản phẩm ");
            String name = sc.nextLine();
            System.out.println("Nhập giá sản phẩm ");
            double price = Untils.tryDouble(sc);
            Product product = new Product(quantity, name, price);
            products.add(product);
            System.out.println("Bạn muôn tiếp tục nhập sản phẩm không (Y/N)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")){
                System.out.println("Tiếp tục nhập");
            }else {
                Menu menu = new Menu();
                menu.inputDisplay(sc, products);
                break;
            }
        }while (true);
    }

    public void displayProduct(Scanner sc, ArrayList<Product> products){
        for (Product product : products) {
            System.out.println(product);
        }
        Menu menu = new Menu();
        menu.inputDisplay(sc, products);

    }

    public void removeProduct(Scanner sc, ArrayList<Product> products) {
        int id = Untils.tryInteger(sc);
        for (Product product: products) {
            if (findProduct(id, products) != null) {
                products.remove(product);
                Menu menu = new Menu();
                menu.inputDisplay(sc, products);
            } else {
                System.out.println("không tìm thấy sản phẩm");
            }
        }

    }
    public Product findProduct( int id, ArrayList<Product> products){

        for (Product product: products) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
}
