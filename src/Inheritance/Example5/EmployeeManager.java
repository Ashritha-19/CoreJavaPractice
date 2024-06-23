package Inheritance.Example5;

public class EmployeeManager {

        public static void main(String[] args) {
            Employee emp1 = new Employee(1, "Sri", "HR");
            FullTimeEmployee emp2 = new FullTimeEmployee(2, "Krish", "Engineering", 70000);
            ContractEmployee emp3 = new ContractEmployee(3, "Ashri", "Marketing", 50, 160);

            emp1.displayDetails();
            System.out.println();
            emp2.displayDetails();
            System.out.println();
            emp3.displayDetails();
        }
}


