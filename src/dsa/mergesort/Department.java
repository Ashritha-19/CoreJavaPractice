package dsa.mergesort;

public class Department {

        private String name;
        private int employeeCount;

        public Department(String name, int employeeCount) {
            this.name = name;
            this.employeeCount = employeeCount;
        }

        public String getName() {
            return name;
        }

        public int getEmployeeCount() {
            return employeeCount;
        }

        @Override
        public String toString() {
            return "Department{" + "name='" + name + '\'' + ", employeeCount=" + employeeCount + '}';
        }

}
