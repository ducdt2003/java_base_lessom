package arratlist.lab_1;

class Member {
    int id;
    String name;
    String dob; // Date of birth
    String job;

    // Constructor
    public Member(int id, String name, String dob, String job) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

  /*  public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Job: " + job);
        System.out.println();
    }*/

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
