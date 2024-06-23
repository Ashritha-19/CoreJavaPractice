package Inheritance.Example5;

public class FullTimeEmployee extends Employee{

        private double salary;

        public FullTimeEmployee(int id, String name, String department, double salary) {
            super(id, name, department);
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("FullTimeEmployee [Salary=" + salary + "]");
        }
}


