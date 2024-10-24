package java_function;

public class JavaFunction1 {
    public static void main(String[] args) {
        int kq = Sum(1, 2, 3);
        int kq1 = Sum(10, 2, 3);
        System.out.println(kq1);

        XinChao("male");
        XinChao("female1");
    }
    public static int Sum(int x, int y, int z){
        return x+y+z;
    }

    // hàm thủ tục
    public static void XinChao(String gioiTinh){
        if (gioiTinh.equals("female")){
            System.out.println(" xin chào! tôi là nhân viên nữ ");
        } else if (gioiTinh.equals("male")) {
            System.out.println(" xin chào! tôi là nhân viên nam ");
        }else {
            System.out.println(" không hiểu m nhập cái gì ");
        }
    }

}
