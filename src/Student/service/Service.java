package Student.service;

import Student.model.Student;
import Student.model.Subject;

public class Service {

    public Student result(Student student) {

        for (Subject subject : student.subject) {


            if (subject.marks >= 35) {
                System.out.println("Pass");

            } else {
                System.out.println("Fail");
            }
        }
        return student;
    }
}
