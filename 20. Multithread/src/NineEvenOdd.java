class NumberPrinter {
    private int count = 1;
    private final int MAX_COUNT = 20;

    // Synchronized method to ensure only one thread accesses this method at a time
    public synchronized void printOdd() {
        while (count <= MAX_COUNT) {
            if (count % 2 == 1) {
                System.out.println("Odd: " + count);
                count++;
                notify();  // Notify the even printing thread to start
                try {
                    Thread.sleep(1000);  // Pause for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    //System.out.println("Thread interrupted: " + e.getMessage());
                }
            } else {
                try {
                    wait();  // Wait if it's not an odd number
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    //System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }

    public synchronized void printEven() {
        while (count <= MAX_COUNT) {
            if (count % 2 == 0) {
                System.out.println("Even: " + count);
                count++;
                notify();  // Notify the odd printing thread to start
                try {
                    Thread.sleep(1000);  // Pause for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    //System.out.println("Thread interrupted: " + e.getMessage());
                }
            } else {
                try {
                    wait();  // Wait if it's not an even number
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    //System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }
}

class OddThread extends Thread {
    private final NumberPrinter printer;

    OddThread(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printOdd();
    }
}

class EvenThread extends Thread {
    private final NumberPrinter printer;

    EvenThread(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printEven();
    }
}

public class NineEvenOdd {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new OddThread(printer);
        Thread evenThread = new EvenThread(printer);

        oddThread.start();
        evenThread.start();
    }
}
