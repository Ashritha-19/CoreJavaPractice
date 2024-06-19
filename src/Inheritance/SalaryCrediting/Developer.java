package Inheritance.SalaryCrediting;

public class Developer extends Employee {

        private double allowance;
        private double performanceRating;

        public Developer(String name, double baseSalary, double taxRate, double allowance, double performanceRating) {
            super(name, baseSalary, taxRate);
            this.allowance = allowance;
            this.performanceRating = performanceRating;
        }

        @Override
        public void creditSalary() {
            double performanceBonus = getBaseSalary() * performanceRating;
            double salary = (getBaseSalary() + allowance + performanceBonus);
            double tax = salary * getTaxRate();
            double finalSalary = salary - tax;
            System.out.println(getName() + " has been credited with salary: " + finalSalary + "/-");
        }

        public double getAllowance() {
            return allowance;
        }

        public double getPerformanceRating() {
            return performanceRating;
        }

    @Override
    public String toString() {
        return "Developer{" +
                "allowance=" + allowance +
                ", performanceRating=" + performanceRating +
                '}';
    }
}


