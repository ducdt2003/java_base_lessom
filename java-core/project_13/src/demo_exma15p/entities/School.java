package demo_exma15p.entities;

import java.util.List;

public class School {
    private List<Classroom> classroom;
    private String term;

    public School() {
    }

    public School(List<Classroom> classroom, String term) {
        this.classroom = classroom;
        this.term = term;
    }

    public List<Classroom> getClassroom() {
        return classroom;
    }

    public void setClassroom(List<Classroom> classroom) {
        this.classroom = classroom;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "School{" +
                "classroom=" + classroom +
                ", term='" + term + '\'' +
                '}';
    }
}
