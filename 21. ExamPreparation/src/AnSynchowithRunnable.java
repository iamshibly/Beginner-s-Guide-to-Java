public class AnSynchowithRunnable {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread oddRunnable = new Thread(new OddThread11(lock));
        Thread evenRunnable = new Thread(new EvenThread11(lock));
        oddRunnable.start();

        evenRunnable.start();

    }
}

class OddThread11 implements Runnable {
    final Object lock;
    OddThread11(Object lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 99; i += 2) {
            synchronized(lock){
                System.out.println("Odd_" + i);
                try {
                    Thread.sleep(2000);// Sleep for 4 seconds
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

class EvenThread11 implements Runnable {
    final Object lock;
    EvenThread11(Object lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            synchronized(lock){
                System.out.println("Even_" + i);
                try {
                    Thread.sleep(2000);// Sleep for 4 seconds
                    lock.notify();
                    if(i<100){
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
