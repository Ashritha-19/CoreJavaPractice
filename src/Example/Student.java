package Example;



public class Student {

      public String name;

      public int phnNumber;

      public String   dob;

    public String stdClass;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phnNumber=" + phnNumber +
                ", dob='" + dob + '\'' +
                ", stdClass='" + stdClass + '\'' +
                '}';
    }
}
