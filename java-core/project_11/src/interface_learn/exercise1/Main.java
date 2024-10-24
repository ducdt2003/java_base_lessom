package interface_learn.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tiêu đề: ");
        String title = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();

        System.out.print("Nhập ngày xuất bản: ");
        String publicDate = sc.nextLine();

        System.out.print("Nhập điểm đánh giá: ");
        double rate = sc.nextDouble();

        News news = new News(title, author, publicDate, rate);
        news.display();
    }
}
