package exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khởi tạo đối tượng --> dùng hàm khởi tạo
        Account accountSysten = new Account("techmaster" , "hoclacoviec", 1000000);
     do {
         boolean isLoginSuccess = login(sc, accountSysten);
         if(!isLoginSuccess){
             System.out.println(" thất bại ");
         }else {
             System.out.println(" đăng nhập thành công, mời bạn lựa chọn  ");
             do {
                 System.out.println("1- Xem thông tin tài khoản ");
                 System.out.println("2- rút tiền");
                 int choice = Integer.parseInt(sc.nextLine());
                 switch (choice){
                     case 1:
                         System.out.println(accountSysten);
                         break;
                     case 2:
                         System.out.println(" mời bạn nhập tiền muốn rút ");
                         double money = Double.parseDouble(sc.nextLine());
                         if(money <= 0 || money > accountSysten.getBalance()){
                             System.out.println(" số tiền hợp lệ ");
                         }else {
                             double remainAmt = accountSysten.getBalance() - money;
                             accountSysten.setBalance(remainAmt);
                         }
                         break;
                 }
             }while (true);

         }
     }while (true);
    }
    public static boolean login(Scanner sc, Account accountSysten){
        System.out.println(" Mời bạn nhập username");
        String username = sc.nextLine();
        System.out.println(" Mời bạn nhập username");
        String password = sc.nextLine();
        if(username.equals(accountSysten.getUserName()) && password.equals(accountSysten.getPassWord())){
            return true;
        }
        return false;
    }
}
