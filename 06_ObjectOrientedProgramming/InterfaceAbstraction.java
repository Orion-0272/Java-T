/*
The abstract class does not provide the 100% abstraction, due to which there are interfaces.

Interface is non-primitive datatype, and is another way to achieve 100% abstraction.
The interface is never extended but implemented, and hence, we can implement any number of interface with one class.
*/

interface LivingBeing {
    void breathing();
}

interface HumanBeings {
    void talk();
    void walk();
    void sleep();
}

interface Unified extends LivingBeing, HumanBeings {
    /*
    Inherit all the methods of both interface.
    */
}

class Boys implements Unified {
    @Override
    public void breathing() {
        System.out.println("Boy is breathing.");
    }

    @Override
    public void talk() {
        System.out.println("Boy is talking");
    }

    @Override
    public void walk() {
        System.out.println("Boy is walking");
    }

    @Override
    public void sleep() {
        System.out.println("Boy is sleeping");
    }
}

public class InterfaceAbstraction {
    public static void main(String[] args) {
        // As I have implemented two interface, therefore I am creating object as normal.
        Boys boy1 = new Boys();
        boy1.breathing();
        boy1.walk();
        boy1.talk();
        boy1.sleep();

        /*
        For windows press `ctrl + click` and for mac press `command + click` over the method of boy1 and boy2.
        For boy1, you will be redirected to the actual implementation of the method.
        But for boy2, you will be redirected to the method signature in the interface. This helps to hide the implementation.
        */

        Unified boy2 = new Boys();
        boy2.breathing();
        boy2.walk();
        boy2.talk();
        boy2.sleep();
    }
}
