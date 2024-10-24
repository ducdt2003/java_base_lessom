package Interface.Interface_2.service;

public class LucianService implements ISurf, ICut {
    @Override
    public void surf() {
        System.out.println("Lucian Lướt...");
    }

    @Override
    public void cut() {
        System.out.println("Lucian chém");
    }
}
