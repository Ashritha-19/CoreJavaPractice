package Inheritance.Example5;

public class Employee {

        private int id;
        private String name;
        private String department;

        public Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void displayDetails() {

            System.out.println("Employee [ID=" + id + ", Name=" + name + ", Department=" + department + "]");

        }
}


