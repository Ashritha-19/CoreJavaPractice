package Inheritance.Example1;


public class InheritanceTest {

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        String greet = helloWorld.sayHi();

        System.out.println(greet);


        HelloWorldService helloWorldService = new HelloWorldService();
        String greeting = helloWorldService.sayHi();

        System.out.println(greeting);



    }
}
