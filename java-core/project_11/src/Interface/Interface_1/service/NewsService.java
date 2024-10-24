package Interface.Interface_1.service;

import Interface.Interface_1.entities.News;

import java.util.Scanner;

public class NewsService implements INews {
    public News inputNews(Scanner sc){
        System.out.println("Nhập Title: ");
        String title = sc.nextLine();
        System.out.println("Nhập Author: ");
        String author = sc.nextLine();
        System.out.println("Nhập PublicDate: ");
        String publicDate = sc.nextLine();
        System.out.println("Nhập Rate: ");
        double rate = Double.parseDouble(sc.nextLine());
        return new News(title, author, publicDate, rate);
    }

    @Override
    public void display(News news) {
        System.out.println(news);
    }
}
