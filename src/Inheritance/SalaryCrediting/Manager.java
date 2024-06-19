package Inheritance.SalaryCrediting;

public class Manager extends Employee{

        private double bonus;

    public Manager(String name, double baseSalary, double taxRate, double bonus) {
        super(name, baseSalary, taxRate);
        this.bonus = bonus;
    }

    @Override
        public void creditSalary() {
            double tax = getBaseSalary() * getTaxRate();
            double finalSalary = getBaseSalary() + bonus - tax;
            System.out.println(getName() + " has been credited with salary: " + finalSalary + "/-");
        }

        public double getBonus() {
            return bonus;
        }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}


