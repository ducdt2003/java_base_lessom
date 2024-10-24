package enum_demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wheather wheather = new Wheather(Season.SPRING);
        System.out.println(wheather.toString());
    }
}
