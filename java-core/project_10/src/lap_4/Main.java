package lap_4;


import lap_4.entities.Employee;
import lap_4.views.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Employee> employees = new ArrayList<>();
        Menu menu = new Menu();
        menu.menu(sc, employees);
    }
}
