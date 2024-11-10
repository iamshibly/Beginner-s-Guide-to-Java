public class AoThreeSynOddaftereven {
    public static void main(String[] args) {
        Object lock = new Object();
        boolean[] isOddComplete = {false}; // Shared state to track OddThread completion

        OddThread4 oddThread = new OddThread4(lock, isOddComplete);
        EvenThread4 evenThread = new EvenThread4(lock, isOddComplete);

        oddThread.setName("Odd");
        evenThread.setName("Even");

        oddThread.start();
        evenThread.start();
    }
}

class OddThread4 extends Thread {
    private final Object lock;
    private final boolean[] isOddComplete;

    OddThread4(Object lock, boolean[] isOddComplete) {
        this.lock = lock;
        this.isOddComplete = isOddComplete;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 99; i += 2) {
                System.out.println(Thread.currentThread().getName() + "_" + i);
                try {
                    sleep(400); // Sleep for 4 seconds after each print
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            isOddComplete[0] = true; // Set flag indicating OddThread is done
            lock.notify(); // Notify the even thread to start after odd numbers are printed
        }
    }
}

class EvenThread4 extends Thread {
    private final Object lock;
    private final boolean[] isOddComplete;

    EvenThread4(Object lock, boolean[] isOddComplete) {
        this.lock = lock;
        this.isOddComplete = isOddComplete;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (!isOddComplete[0]) { // Wait until OddThread is complete
                try {
                    lock.wait(); // Wait for notification from OddThread
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            // Print even numbers after odd sequence is complete
            for (int i = 2; i <= 100; i += 2) {
                System.out.println(Thread.currentThread().getName() + "_" + i);
                try {
                    sleep(400); // Sleep for 4 seconds after each print
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
