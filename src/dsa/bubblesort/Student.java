package dsa.bubblesort;

public class Student {

        private int rollNumber;
        private String name;
        private int marks;

        public Student(int rollNumber, String name, int marks) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.marks = marks;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + ", marks=" + marks + '}';
        }


}
