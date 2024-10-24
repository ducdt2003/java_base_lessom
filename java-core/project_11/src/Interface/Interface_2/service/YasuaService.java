package Interface.Interface_2.service;

public class YasuaService implements ISurf, ICut {
    @Override
    public void cut() {
        System.out.println("Yasua chém...");
    }

    @Override
    public void surf() {
        System.out.println("Yasua lướt...");
    }
}
