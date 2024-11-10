import java.util.logging.Logger;
import java.util.logging.Level;

class ThreadTwo implements Runnable {
    String s;

    // Constructor without priority
    ThreadTwo(String s) {
        this.s = s;
        // Create a new thread with this Runnable instance
        Thread t = new Thread(this);
        t.start(); // Start the thread
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(5000); // Simulate work
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(s); // Print the string
        }
    }
}

public class FourMultithreadAndMultitask {
    public static void main(String[] args) {
        // Create instances of ThreadTwo without priority
        ThreadTwo t3 = new ThreadTwo("Rohim");
        ThreadTwo t4 = new ThreadTwo("Korim");
    }
}
