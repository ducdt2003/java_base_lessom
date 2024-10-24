package demo_exma15p.entities;

import java.util.List;

public class Classroom {
    private List<Student> students;

    public Classroom() {
    }

    public Classroom(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "students=" + students +
                '}';
    }
}
