package arratlist.arratlist2.entities;

import arratlist.arratlist2.utils.Sex;

public class Mother extends Family {
    private double weight;

    public Mother() {
    }


    public Mother(String id, String name, Sex dob, String job, double weight) {
        super(id, name, dob, job);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Father{" + "ID: " + getId() + "Name: " + getName() +
                "Giới Tính: " + getDob() + " Công Việc: " + getJob() +
                "weight = " + weight +
                '}';
    }
}
