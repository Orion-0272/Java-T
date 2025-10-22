/*
For achieving the run time polymorphism, we use method overriding.
*/

class Runs {
    public void run() {
        System.out.println("Something is running!");
    }
}

class Program extends Runs {
    // Overriding the run() method.
    @Override
    public void run() {
        System.out.println("Program is running!");
    }
}

class Humans extends Runs {

}

public class RunTImePolymorphism {
    public static void main(String[] args) {
        Runs r = new Runs();
        Program p = new Program();
        Humans h = new Humans();

        r.run(); // Something is running!
        p.run(); // Program is running!
        h.run(); // Something is running!

        /*
        As you can see the p.run() will invoke the run() method inside the Program class, but h.run() will invoke the run() method of Runs class.
        It will be decided at the run time which run() method will be invoked.
        Here, we can see that same method works differently for different objects. This is run time polymorphism.
        */
    }
}
