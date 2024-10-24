package lab_1.entities;

public class Student {
    private static int autoId = 0;
    private int id;
   private String name;
   private String add;

    public Student() {
    }

    public Student(String name, String add) {
        this.id = autoId++;
        this.name = name;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" + " ID=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
