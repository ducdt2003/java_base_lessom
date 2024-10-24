package arratlist.arratlist2.entities;

import arratlist.arratlist2.utils.Sex;

public class Family {
    private String id;
    private String name;
    private Sex dob;
    private String job;

    public Family() {
    }

    public Family(String id, String name, Sex dob, String job) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Sex getDob() {
        return dob;
    }

    public void setDob(Sex dob) {
        this.dob = dob;
    }
}
