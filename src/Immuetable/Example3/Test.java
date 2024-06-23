package Immuetable.Example3;

public class Test {

    public static void main(String[] args) {

        Dob dob = new Dob(3,"3","2000");

        Person person = new Person("Krish","24","Male", dob);

        System.out.println(person);

    }
}
