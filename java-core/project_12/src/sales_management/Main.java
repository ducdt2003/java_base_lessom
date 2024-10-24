package sales_management;

import sales_management.entities.Product;
import sales_management.views.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.inputDisplay(sc, products);
    }
}
