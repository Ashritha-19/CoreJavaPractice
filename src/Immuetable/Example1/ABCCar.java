package Immuetable.Example1;

public class ABCCar {

    private String colour;
    private String wheel;             // String will be replaced with classes
    private String dashBoard;
    private String engine;


    public ABCCar(String colour, String wheel,String dashBoard) {
        this(colour,dashBoard,wheel,"2000");
    }

    public ABCCar(String colour, String wheel, String dashBoard, String engine) {
        this.colour = colour;
        this.wheel = wheel;
        this.dashBoard = dashBoard;
        this.engine = engine;
    }
}
