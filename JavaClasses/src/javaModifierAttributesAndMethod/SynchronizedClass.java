package javaModifierAttributesAndMethod;


public class SynchronizedClass {
    private int counter = 0;

    // Synchronized method
    public synchronized void increment() {
        counter++;
    }

    // Non-synchronized method
    public void printCounter() {
        System.out.println("Counter: " + counter);
    }

    // Synchronized block
    public void performSynchronizedTask() {
        synchronized (this) {
            // Code inside this block is synchronized
            // Only one thread can execute this block at a time
            // ...
        }
    }

    public static void main(String[] args) {
    	SynchronizedClass example = new SynchronizedClass();

        // Creating multiple threads to demonstrate synchronization
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        example.printCounter();
    }
}
