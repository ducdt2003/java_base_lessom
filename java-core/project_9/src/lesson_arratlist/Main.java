package lesson_arratlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        // thêm phần tử
        integers.add(4);
        integers.add(2);
        integers.add(5);
        System.out.println(integers);
    }
}
