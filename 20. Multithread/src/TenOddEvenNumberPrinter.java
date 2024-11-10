public class TenOddEvenNumberPrinter {
    private static final int START = 1;
    private static final int END = 8;
    private int currentNumber = START;
    private boolean printedAllOdds = false;
    private final Object lock = new Object();

    public static void main(String[] args) {
        TenOddEvenNumberPrinter printer = new TenOddEvenNumberPrinter();
        Thread oddThread = new Thread(() -> printer.printOddNumbers());
        Thread evenThread = new Thread(() -> printer.printEvenNumbers());

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All numbers printed!");
    }

    private synchronized void printOddNumbers() {
        while (currentNumber <= END) {
            if (currentNumber % 2 != 0) {
                System.out.println("Odd: " + currentNumber);
                currentNumber++;
            } else {
                if (printedAllOdds) {
                    return;
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        printedAllOdds = true;
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    private synchronized void printEvenNumbers() {
        while (currentNumber <= END) {
            if (currentNumber % 2 == 0) {
                System.out.println("Even: " + currentNumber);
                currentNumber++;
            } else {
                if (printedAllOdds) {
                    try {
                        synchronized (lock) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }
}