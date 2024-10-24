package arratlist.arratlist2.entities;

import arratlist.arratlist2.utils.Sex;

public class Father extends Family {
    private double height;

    public Father() {
    }

    public Father(String id, String name, Sex dob, String job, double height) {
        super(id, name, dob, job);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Father{" + "ID: " + getId() + "Name: " + getName() +
                "Giới Tính: " + getDob() + " Công Việc: " + getJob() +
                "height = " + height +
                '}';
    }
}
