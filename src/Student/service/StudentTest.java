package Student.service;

import Student.model.Student;
import Student.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[]args){

        List<Subject> subjectList = new ArrayList<>();

        Subject subject1 = new Subject();
        subject1.subjectName = "English";
        subject1.marks = 34;

        Subject subject2 = new Subject();
        subject2.subjectName = "Telugu";
        subject2.marks = 45;

        Subject subject3 = new Subject();
        subject3.subjectName = "Hindi";
        subject3.marks = 36;

        Subject subject4 = new Subject();
        subject4.subjectName = "Maths";
        subject4.marks = 57;

        Subject subject5 = new Subject();
        subject5.subjectName = "Science";
        subject5.marks =42;

        Subject subject6 = new Subject();
        subject6.subjectName = "Social";
        subject6.marks = 29;

        subjectList.add(subject1);
        subjectList.add(subject2);
        subjectList.add(subject3);
        subjectList.add(subject4);
        subjectList.add(subject5);
        subjectList.add(subject6);

        Student student = new Student();
        student.name ="Krish";
        student.rollNo = "21";
        student.subject = subjectList;

        Service service = new Service();
        service.result(student);

    }

}
