package demo_exma15p.entities;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate date;
    private String countryside;

    public Student() {
    }

    public Student(String name, LocalDate date, String countryside) {
        this.name = name;
        this.date = date;
        this.countryside = countryside;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCountryside() {
        return countryside;
    }

    public void setCountryside(String countryside) {
        this.countryside = countryside;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", countryside='" + countryside + '\'' +
                '}';
    }
}
