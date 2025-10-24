class TaskThree implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Task 3 is executing...");
        }
    }
}

class TaskFour implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Task 4 is executing...");
        }
    }
}

public class ThreadRunnable {
    public void main(String[] args) {
        // Object of class for thread.
        Runnable t3 = new TaskThree();
        Runnable t4 = new TaskFour();

        // Actual thread.
        Thread thread3 = new Thread(t3);
        Thread thread4 = new Thread(t4);

        thread3.start();
        thread4.start();

        try {
            // This makes the main thread to wait for other threads to complete the execution.
            // But it throws the `InterruptedException` and we have to handle it.
            thread3.join();
            thread4.join();
        }
        catch (InterruptedException exception) {
            System.out.println("Threads are interrupted!");
        }

        System.out.println("Threads are successfully executed.");
    }
}
