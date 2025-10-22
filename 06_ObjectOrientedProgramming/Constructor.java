/*
Constructor:
A constructor is a special behaviour or method for any object. For any other behaviour to run we have to call that behaviour with the object name.
But constructor will always be called automatically when we create a object of that class.

The constructor will always have same name as class.
We can also create multiple constructors for same class. Each constructor can ask for any number of data.

`this` keyword:
`this` keyword is a special keyword which holds the reference or memory location of the current object.
For example: for pen1, `this` will hold the memory address of pen1. for pen2, `this` will hold the memory address of pen2.

*/

// Defining the class for pen.
class Pens {
    // The properties.
    String brand;
    String color;
    String type;
    int price;
    boolean isWriting;

    // Constructor
    Pens() {
        System.out.println("Constructor one was called. An object is created!");
    }

    Pens(String brand, String color, String type, int price) {
        System.out.println("Constructor two was called. An object is created!");
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.isWriting = false;
    }

    // Behaviour or Methods.
    public void write(String message) {
        this.isWriting = true;
        System.out.println("Written the message: " + message);
    }

    public void stop() {
        this.isWriting = false;
        System.out.println("Stopped writing.");
    }

    public void getInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
    }
}


public class Constructor {
    public static void main(String[] args) {
        // The object of class Pen.
        Pens pen1 = new Pens();
        Pens pen2 = new Pens();

        // This will invoke the constructor with same no. of parameter.
        Pens pen3 = new Pens("Trimax", "Blue", "Ball point", 200);


        // Here we are calling the behaviour or method of the object.
        pen1.write("Hello World from pen1.");
        pen2.write("Hello World from pen2.");

        pen3.getInfo();
    }
}
