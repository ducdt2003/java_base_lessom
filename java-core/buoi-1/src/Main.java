public class Main {
    public static void main(String[] args) {
        System.out.println(" số pi " + Math.PI);
        int r = 5;
        double s = r * r * Math.PI;
        System.out.println("Diện tích hình tròn " + s );

        int x = 5;
        int y = 9;
        System.out.println( " giá trị tuyệt đối của y = " + Math.abs(y));


        System.out.println( " số lớn nhất trong hai số x và y là " + Math.max(x, y));
        System.out.println( " số nhỏ nhất trong hai số x và y là " + Math.min(x, y));

        System.out.println(" căn bậc hai của y " + Math.sqrt(y));
        System.out.println(" lũy thừa " + Math.pow(y, x)); // 9 mũ 5 thì y là cơ số x là số mũ

        System.out.println(" làm tròn tăng " + Math.ceil(s));
        System.out.println(" làm tròn giảm " + Math.floor(s));

        System.out.println( " sin " + Math.sin(Math.PI/2));
    }

}