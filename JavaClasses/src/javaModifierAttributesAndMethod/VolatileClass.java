package javaModifierAttributesAndMethod;


public class VolatileClass{
    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag; // Toggle the value of the flag
    }

    public void printFlag() {
        System.out.println("Flag: " + flag);
    }

    public static void main(String[] args) {
    	VolatileClass example = new VolatileClass();

        // Thread 1 toggles the flag
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.toggleFlag();
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2 prints the flag
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.printFlag();
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
