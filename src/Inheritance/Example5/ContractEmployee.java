package Inheritance.Example5;

 public class ContractEmployee extends Employee {

        private double hourlyRate;
        private int hoursWorked;

        public ContractEmployee(int id, String name, String department, double hourlyRate, int hoursWorked) {
            super(id, name, department);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

        public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

        public int getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public double getSalary() {
            return hourlyRate * hoursWorked;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("ContractEmployee [HourlyRate=" + hourlyRate + ", HoursWorked=" + hoursWorked + ", Salary=" + getSalary() + "]");
        }
 }


