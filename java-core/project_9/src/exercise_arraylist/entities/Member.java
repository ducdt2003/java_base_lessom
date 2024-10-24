package exercise_arraylist.entities;

public class Member {
    private static int autoId ;
    private int id;
    private String name;
    private String dob;
    private String job;

    public Member() {
    }

    public Member(String name, String dob, String job) {
        this.id = autoId++;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }


    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Member.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
