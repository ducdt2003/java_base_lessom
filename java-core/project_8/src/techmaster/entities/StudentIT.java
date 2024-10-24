package techmaster.entities;

public class StudentIT extends TechMastStudent {
    private double javaPoint;
    private double htmlPoint;
    private double cssPoint;

    public StudentIT() {
    }

    @Override
    public double getDiem() {
        return (2*getJavaPoint() + getHtmlPoint() + getCssPoint()) / 4;
    }

    public StudentIT(String name, String branch, double javaPoint, double htmlPoint, double cssPoint) {
        super(name, branch);
        this.javaPoint = javaPoint;
        this.htmlPoint = htmlPoint;
        this.cssPoint = cssPoint;
    }

    public double getJavaPoint() {
        return javaPoint;
    }

    public void setJavaPoint(double javaPoint) {
        this.javaPoint = javaPoint;
    }

    public double getHtmlPoint() {
        return htmlPoint;
    }

    public void setHtmlPoint(double htmlPoint) {
        this.htmlPoint = htmlPoint;
    }

    public double getCssPoint() {
        return cssPoint;
    }

    public void setCssPoint(double cssPoint) {
        this.cssPoint = cssPoint;
    }



    public void disPlay(){
        System.out.println("---___---");
        System.out.println(" Họ Tên: " + getName());
        System.out.println(" NGành: " + getBranch());
        System.out.println(" Điểm: " + getDiem());
        System.out.println(" Học Lực: " + getHocLuc());
    }

}
