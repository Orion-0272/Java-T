// Defining the class for pen.
class Pen {
    // The properties.
    String brand;
    String color;
    String type;
    int price;
    boolean isWriting = false;

    // Behaviour or Methods.
    public String write(String message) {
        this.isWriting = true;
        return "Written the message: " + message;
    }

    public String stop() {
        this.isWriting = false;
        return "Stopped writing.";
    }
}

public class ClassObjects {
    public static void main(String[] args) {
        // The object of class Pen.
        Pen pen1 = new Pen();
        pen1.brand = "Trimax";
        pen1.color = "Blue";
        pen1.type = "Ball point";
        pen1.price = 200;

        System.out.println("Brand: " + pen1.brand);
        System.out.println("Color: " + pen1.color);
        System.out.println("Type: " + pen1.type);
        System.out.println("Price: " + pen1.price);

        pen1.write("Hello World");
        System.out.println(pen1.isWriting);

        pen1.stop();
        System.out.println(pen1.isWriting);

    }
}
