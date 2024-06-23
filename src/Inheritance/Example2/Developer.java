package Inheritance.Example2;

public class Developer extends Employee {

    public String programmingLanguage;

   public Developer(String name, String id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    public void writingCode(){

        System.out.println(name + " is writing code " + programmingLanguage);

    }
}
