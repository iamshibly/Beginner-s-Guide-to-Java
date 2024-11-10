class OddThread2 extends Thread {
    final Object lock;

    OddThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            synchronized (lock) {
                System.out.println("Odd_" + i);
                try {
                    sleep(2000); // Sleep for 2.5 minutes
                    lock.notify(); // Notify the even thread to proceed
                    lock.wait();   // Wait until the even thread completes
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

class EvenThread2 extends Thread {
    final Object lock;

    EvenThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            synchronized (lock) {
                System.out.println("Even_" + i);
                try {
                    sleep(2000); // Sleep for 2.5 minutes
                    lock.notify();// Notify the odd thread to proceed
                    if(i<100) {
                        lock.wait();
                    }// Wait until the odd thread completes

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

public class AmSynchroAndThreadClass {
    public static void main(String[] args) {
        Object lock = new Object(); // Shared lock for synchronization

        OddThread2 oddThread = new OddThread2(lock);
        EvenThread2 evenThread = new EvenThread2(lock);

        oddThread.start();
        evenThread.start();
    }
}
