package Immuetable;

public class Ashri {

    public int age;

    public Dob dob;

    @Override
    public String toString() {
        return "Ashri{" +
                "age=" + age +
                ", dob=" + dob +
                '}';
    }

    public Ashri(int age, Dob dob){
        this.age = age;
        this.dob = new Dob("1","1","2000");




    }
}
