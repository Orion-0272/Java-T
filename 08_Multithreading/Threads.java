class TaskOne extends Thread {
    // Defining the task of thread
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Task 1 executing...");
        }
    }
}

class TaskTwo extends Thread {
    // Defining the task of thread
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Task 2 executing...");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();

        // Starting the execution of thread.
        t1.start();
        t2.start();

        /*
        You will see that the output is not constant, as they both thread are running independently of each other.

        But there is a problem, that we use inheritance.
        In java, we could only inherit one class. If both task wants to inherit from another class then, what we will do?
        That is why, `Runnable` interface is introduced.
        */
    }
}
