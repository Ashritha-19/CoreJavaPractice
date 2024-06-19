package Inheritance.SalaryCrediting;

public class Intern extends Employee {

        private double stipend;
        private int hoursWorked;
        private double hourlyRate;

        public Intern(String name, double baseSalary, double taxRate, double stipend, int hoursWorked, double hourlyRate) {
            super(name, baseSalary, taxRate);
            this.stipend = stipend;
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public void creditSalary() {
            double workPayment = hoursWorked * hourlyRate;
            double totalSalary = getBaseSalary() + stipend + workPayment;
            double tax = totalSalary * getTaxRate();
            double finalSalary = totalSalary - tax;
            System.out.println(getName() + " has been credited with salary: " + finalSalary + "/-");
        }

        public double getStipend() {
            return stipend;
        }

        public int getHoursWorked() {
            return hoursWorked;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

    @Override
    public String toString() {
        return "Intern{" +
                "stipend=" + stipend +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}

