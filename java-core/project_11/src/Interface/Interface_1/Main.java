package Interface.Interface_1;

import Interface.Interface_1.entities.News;
import Interface.Interface_1.service.NewsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewsService newsService = new NewsService();
        System.out.println("Mời Bạn nhập thông tin bản tin");
        Scanner sc = new Scanner(System.in);
        News news = newsService.inputNews(sc);
        newsService.display(news);
    }
}
