package inheritance;

public class Student extends People {
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name: " + super.getName() +
                "score=" + score +
                '}';
    }
}
