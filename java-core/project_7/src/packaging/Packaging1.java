package packaging;

public class Packaging1 {
    private int soDu;

    public void rutTien(int soTien){
        soDu -= soTien;
    }
    public void guiTien(int soTien){
        soDu += soTien;
    }
    public double SoDu(){
        return soDu;
    }
}
