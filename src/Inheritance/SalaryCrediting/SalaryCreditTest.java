package Inheritance.SalaryCrediting;

public class SalaryCreditTest {

    public static void main(String[] args) {
        Manager manager = new Manager("Krish",75000,0.1,2000);
        Developer developer = new Developer("Ashri",30000,0,1899,0.5);
        Intern intern = new Intern("Putty",12000,0,720,8,15);

        manager.creditSalary();
        developer.creditSalary();
        intern.creditSalary();

    }
}
