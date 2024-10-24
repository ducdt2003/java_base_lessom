package Bai_Tap;

public class bai_6 {
    public static void main(String[] args) {
        // quảng đường bằng vận tốc nhân thời gian
        double vCar = 54 ;
        double tCar = 2.25;
        double sCar = vCar * tCar;
        System.out.println( " quãng đường ô tô đi được là " + sCar);

        double vMoto = 38;
        double tMOto = 2.25;
        double sMoto = vMoto * tMOto;
        System.out.println( " quãng đường mô tô đi đượng là " + sMoto);

        double sQuangDuong = sCar + sMoto;
        System.out.println(" quãng đuường đó là " + sQuangDuong);
    }
}
