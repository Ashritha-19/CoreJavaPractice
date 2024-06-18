package Inheritance.Example2;

public class Manager extends Employee {

    public int teamSize;

    public Manager(String name, String id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    public void heldMeeting(){

        System.out.println(name + " is helding meeting for 5 members of Team.");
    }
}
