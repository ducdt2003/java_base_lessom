package exam_15p.entities;

import demo_exma15p.entities.Student;

import java.util.ArrayList;

public class School {
    private String classRoom;
    private String course;
    private String semester;

    private ArrayList<Student> students;

    public School() {
    }

    public School(String classRoom, String course, String semester, ArrayList<Student> students) {
        this.classRoom = classRoom;
        this.course = course;
        this.semester = semester;
        this.students = students;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "classRoom='" + classRoom + '\'' +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                ", students=" + students +
                '}';
    }
}
