package homework.entities;

public class StudentIT extends TechMastStudent {
    public double javaPoint;
    private double htmlPoint;
    private double cssPoint;


    public StudentIT() {
    }

    @Override
    public double getDiem() {
        return ( 2 * getJavaPoint() + getHtmlPoint() + getCssPoint()) / 4;
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



    public void disPlay() {
        System.out.printf("Họ tên: %s, Ngành: %s, Điểm: %.2f, Học lực: %s%n", getName(), getBranch(), getDiem(),
                getHocLuc());
    }

}
