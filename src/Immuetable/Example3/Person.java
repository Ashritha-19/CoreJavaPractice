package Immuetable.Example3;


public class Person {

    private String name;
    private String age;
    private String gender;
    private Dob dob;

    public Person(String krish, String number, String male, Dob dob) {

    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
        this.dob = new Dob(3,"3","2000");
    }

    public Person(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = new Dob(3,"3","2000");
    }


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Dob getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                '}';
    }
}

