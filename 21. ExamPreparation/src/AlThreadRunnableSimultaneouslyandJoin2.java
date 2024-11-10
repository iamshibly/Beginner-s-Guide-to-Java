public class AlThreadRunnableSimultaneouslyandJoin2 {
    public static void main(String[] args) {
        Thread oddRunnable = new Thread(new OddThread1());
        Thread evenRunnable = new Thread(new EvenThread1());
        oddRunnable.setName("Odd");
        evenRunnable.setName("Even");
        oddRunnable.start();
        evenRunnable.start();

    }
}

class OddThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName()+"_" + i);

            try {
                Thread.sleep(4000); // Sleep for 4 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class EvenThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName()+"_" + i);
            try {
                Thread.sleep(4000); // Sleep for 4 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
