package Interface.interface_4.service;

import Interface.interface_4.entities.Student;

import java.util.ArrayList;

public interface IClassification {
    void classify(Student student);
    void display(ArrayList<Student> students);

}
