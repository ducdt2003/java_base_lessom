package book_management.service;

import book_management.entities.Books;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    public void inputBooks(Scanner sc){
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập name: ");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());
        Books books1 = new Books(id, name, quantity);
    }
}
