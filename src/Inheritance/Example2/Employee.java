package Inheritance.Example2;

public class Employee {

    public String name;

    public String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void work(){

        System.out.println(name + " is working.");

    }

    public void takeBreak(){

        System.out.println(name + " is taking break");
    }

}
