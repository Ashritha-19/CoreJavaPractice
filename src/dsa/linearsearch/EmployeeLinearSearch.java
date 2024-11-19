package dsa.linearsearch;

import java.util.ArrayList;

public class EmployeeLinearSearch {

        public static Employee linearSearchByName(ArrayList<Employee> employees, String targetName) {
            for (Employee emp : employees) {
                if (emp.getName().equalsIgnoreCase(targetName)) {
                    return emp;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "Ashri", 50000));
            employees.add(new Employee(2, "Krish", 60000));
            employees.add(new Employee(3, "Shriran", 70000));

            String targetName = "Krish";
            Employee result = linearSearchByName(employees, targetName);
            System.out.println(employees.get(2).hashCode());

            if (result != null) {
                System.out.println("Employee found: " + result);
            } else {
                System.out.println("Employee not found.");
            }
        }

}
