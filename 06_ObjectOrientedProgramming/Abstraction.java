/*
Abstraction:
Abstraction is the process of hiding the implementation details and showing only the essential features of an object.
For example: A person does not need to know how the engine internally works. Person just use the steering, accelerator, breaks, etc. to drive car.
Therefor, the internal details of car is hidden from person and only the essential ones are shown.

In Java, abstraction can be achieved by two of the following:
1. Abstract class
2. Interface

The object of both abstract class and interface cannot be created.
*/

abstract class Human {

    // Abstract methods: The method without block of code.
    public abstract void walk();
    public abstract void talk();
    public abstract void sleep();

    // Concrete methods: The method with block of code.
    public void cookFood(String meal) {
        System.out.println("Cooking meal: " + meal);
    }
}

class Women extends Human {
    @Override
    public void walk() {
        System.out.println("Women is walking");
    }

    @Override
    public void talk() {
        System.out.println("Women is talking");
    }

    @Override
    public void sleep() {
        System.out.println("Women is sleeping");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // <interface> <object> = new <class>();
        Human women = new Women();

        /*
        For windows press `ctrl + click` and for mac press `command + click` over the method.
        You will be redirected to the abstract class, instead of the actual implementation.

        But if you do for any other simple object of class, you will be redirected to where it is implemented.
        This is abstraction. You will not go onto the implementation, but to the abstract class.
        */

        women.cookFood("Fish");
        women.talk();
        women.walk();
        women.sleep();
    }
}
