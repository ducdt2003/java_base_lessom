package lap_2.entities;

public class Student {
    private static int aotuID =0;
    private int id;
    private String name;
    private double socreMath;
    private double socrePhysic;
    private double socreChemistry;

    public Student() {
    }

    public Student(String name, double socreMath, double socrePhysic, double socreChemistry) {
        this.id = aotuID++;
        this.name = name;
        this.socreMath = socreMath;
        this.socrePhysic = socrePhysic;
        this.socreChemistry = socreChemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSocreMath() {
        return socreMath;
    }

    public void setSocreMath(double socreMath) {
        this.socreMath = socreMath;
    }

    public double getSocrePhysic() {
        return socrePhysic;
    }

    public void setSocrePhysic(double socrePhysic) {
        this.socrePhysic = socrePhysic;
    }

    public double getSocreChemistry() {
        return socreChemistry;
    }

    public void setSocreChemistry(double socreChemistry) {
        this.socreChemistry = socreChemistry;
    }

    @Override
    public String toString() {
        return "Student{" + "ID= " + id +
                "name='" + name + '\'' +
                ", socreMath=" + socreMath +
                ", socrePhysic=" + socrePhysic +
                ", socreChemistry=" + socreChemistry +
                '}';
    }
}
