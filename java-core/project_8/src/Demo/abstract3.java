package Demo;

public class abstract3 {
    //static giúp  hằng số này được truy cập mà không cần tạo đối tượng
    public static final int BUS_SPEED = 20;
    public static final int TRAIN_SPEED = 40;
    public static final int AIRPLANE_SPEED = 80;

    public static void main(String[] args) {
        System.out.println("Vận tốc xe bus: " + BUS_SPEED + " km/h");
        System.out.println("Vận tốc tàu hỏa: " + TRAIN_SPEED + " km/h");
        System.out.println("Vận tốc máy bay: " + AIRPLANE_SPEED + " km/h");
    }
}
