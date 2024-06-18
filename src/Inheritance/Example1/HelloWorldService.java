package Inheritance.Example1;

public class HelloWorldService extends HelloWorld {

    public String sayHi(){

        System.out.println("From HelloWorldService SayHi");
        return super.sayHi()+"Krish";
    }

}
