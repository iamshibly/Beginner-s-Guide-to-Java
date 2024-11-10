import java.util.logging.Level;
import java.util.logging.Logger;

public class SevenTwoRunnable {
    public static void main(String[] args) {
        // Instances of the Runnable tasks are created, and their threads start automatically
        new FirstTask("Rohim");
        new SecondTask("Korim");
    }
}

class FirstTask implements Runnable {
    String name;
    Thread thread;

    // Constructor to receive the name and start the thread
    FirstTask(String name) {
        this.name = name;
        thread = new Thread(this);
        thread.start(); // Start the thread immediately
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " - First Task - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException ex) {
                Logger.getLogger(FirstTask.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class SecondTask implements Runnable {
    String name;
    Thread thread;

    // Constructor to receive the name and start the thread
    SecondTask(String name) {
        this.name = name;
        thread = new Thread(this);
        thread.start(); // Start the thread immediately
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " - Second Task - Count: " + i);
            try {
                Thread.sleep(1500); // Sleep for 1.5 seconds
            } catch (InterruptedException ex) {
                Logger.getLogger(SecondTask.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
