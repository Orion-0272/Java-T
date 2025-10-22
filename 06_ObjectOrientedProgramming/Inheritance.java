/*
Inheritance:
Inheritance means one class can use (inherit) the properties and behaviour of another class. This makes the code reusable.
For example: Every man is a human being. Human being can have properties like gender, height, weight, etc. and behaviour like walk, talk, etc.
So, a man can inherit the properties and behaviour of human being class.

There are three types of inheritance:
1. Single level inheritance: One class inherits from another class.
2. Multilevel inheritance: One class inherits from another class and another class inherits from another class.
3. Hierarchical inheritance: Many class inherits from same class.
*/

class HumanBeing {
    String name;
    String gender;
    int height;
    int weight;

    HumanBeing(String name, String gender, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public void talk() {
        System.out.println(this.name + " is talking");
    }

    public void walk() {
        System.out.println(this.name + " is walking");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping.");
    }

}

class Man extends HumanBeing {
    // This calls the constructor of HumanBeing class, when we create the object of class Man.
    Man(String name, String gender, int height, int weight) {
        super(name, gender, height, weight);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Man aryan = new Man("aryan", "male", 174, 70);

        // We can use behaviours of HumanBeing class in a Man class object because class Man inherits the properties of class HumanBeing.
        aryan.talk();
        aryan.walk();
        aryan.sleep();
    }
}
