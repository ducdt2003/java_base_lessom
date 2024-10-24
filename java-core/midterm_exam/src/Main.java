import view.LoginMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginMenu loginMenu = new LoginMenu();
        loginMenu.selectDisplayMenu(sc);
    }
}
