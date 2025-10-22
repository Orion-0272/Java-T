/*
Polymorphism:
Polymorphism means one action behaving differently in different situations.
In Java, it allows the same method name to perform different tasks depending on the object or data types.

There are two types of polymorphism, i.e.
1. Compile time polymorphism: achieved by method overloading
2. Run time polymorphism: achieved by method overriding
*/

// Compile time polymorphism: method overloading.
class Arthematic {
    // Method with same name, but different parameters.
    public int addition(int number1, int number2) {
        return number1 + number2;
    }
    public int addition(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Arthematic ar = new Arthematic();
        System.out.println(ar.addition(4, 8));
        System.out.println(ar.addition(4, 8, 9));
    }
}
