package Inheritance.SalaryCrediting;

public class Employee {

        private String name;
        private double baseSalary;
        private double taxRate;

        public Employee(String name, double baseSalary, double taxRate) {
            this.name = name;
            this.baseSalary = baseSalary;
            this.taxRate = taxRate;
        }

        public void creditSalary() {
            double tax = baseSalary * taxRate;
            double finalSalary = baseSalary - tax;
            System.out.println(name + " has been credited with salary: /-" + finalSalary);
        }

        public String getName() {
            return name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public double getTaxRate() {
            return taxRate;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", taxRate=" + taxRate +
                '}';
    }
}
