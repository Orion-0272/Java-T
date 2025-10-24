/*
The `synchronized` keyword in Java is used to prevent multiple threads from accessing the same block of code or data at the same time.
This prevents the race condition.

*/
class Incrementer {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class SolutionRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Incrementer counter = new Incrementer();

        // Another way to create threads using lambda functions.
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
        /*
        Everytime you run, you will get the value of count = 2000 a constant.
        */
    }
}

