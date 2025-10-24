/*
A race condition happens when two or more threads try to access or change the same data at the same time, and the final result depends on who runs first.
Which makes the program behave unpredictably
*/
class Counter {
    int count = 0;

    public void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

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
        Run it multiple times and could find that value of counter is unpredictable as both thread making changes at same time.
        */
    }
}
