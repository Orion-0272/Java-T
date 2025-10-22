/*
Encapsulation:
Encapsulation is a way to restrict the access of any properties to other classes.
This restricts the user to not give any invalid data to properties.
There are three main access modifiers:
1. Public: Can be accessible from anywhere. Same class or package or different class or package.
2. Protected: Can be accessible from just inherited | derived | child class. It can be accessed from same class or package or different class or package.
3. Private: Can be accessed only within the same class.

The properties data can be modified using the special methods, known as getters and setters.
*/

class Person {
    public String name;
    private int age;

    Person(String name) {
        this.name = name;
    }

    // Setters: sets the value of private properties.
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Invalid age!");
        }
    }

    // Getters: returns the value of properties.
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Person ram = new Person("Ram");
        ram.setAge(24);

        // ram.setAge(-5); // this will give invalid age.
        // If we do not use encapsulation, then we can set the age of ram to -5.

        System.out.println(ram.getName() + " is of age: " + ram.getAge());
    }
}
