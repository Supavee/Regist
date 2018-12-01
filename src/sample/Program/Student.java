package sample.Program;

import java.util.ArrayList;
import java.util.Collection;

public class Student {
    private String studentName;
    private String studentID;
    private ArrayList<Student> studentSubjects = new ArrayList<>();
    private Subject subjects;

    public Student(String studentName, String studentID, ArrayList<Student> studentSubjects, Subject subjects) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentSubjects = studentSubjects;
        this.subjects = subjects;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    


}
