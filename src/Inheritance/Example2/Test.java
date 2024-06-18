package Inheritance.Example2;

public class Test {

    public static void main(String[] args) {

        Employee employee = new Employee("Krish", "123");

        employee.takeBreak();

        Manager manager = new Manager("Krish","908",5);

        manager.heldMeeting();

        Developer developer = new Developer("Krish","420","Java");

        developer.writingCode();

    }
}
