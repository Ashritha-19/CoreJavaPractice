package dsa.bubblesort;

import java.util.ArrayList;

public class StudentBubbleSortTest {

        public static void bubbleSortByMarks(ArrayList<Student> students) {
            int n = students.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (students.get(j).getMarks() > students.get(j + 1).getMarks()) {

                        Student temp = students.get(j);
                        students.set(j, students.get(j + 1));
                        students.set(j + 1, temp);
                    }
                }
            }
        }

        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student(101, "Krish", 85));
            students.add(new Student(102, "Ashri", 92));
            students.add(new Student(103, "Shriran", 78));

            System.out.println("Before sorting:");
            for (Student student : students) {
                System.out.println(student);
            }

            bubbleSortByMarks(students);

            System.out.println("\nAfter sorting by marks:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
}
