import java.util.logging.Level;
import java.util.logging.Logger;

// Interface 1
interface TaskA extends Runnable {
    default void taskA() {
        System.out.println("Executing Task A");
    }
}

// Interface 2
interface TaskB extends Runnable {
    default void taskB() {
        System.out.println("Executing Task B");
    }
}
// Class implementing both interfaces
class MultiTask implements TaskA, TaskB {
    String name;
    Thread t;
    MultiTask(String name) {
        this.name = name;
        // Start the thread
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        System.out.println(name); // Print the name of the task executor
        for(int i=0; i<2;i++) {
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiTask.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(name);
        }
    }
}

public class EightInheritanceWithRunnable {
    public static void main(String[] args) {
        // Create instances of MultiTask, which will run both tasks
        MultiTask t1 = new MultiTask("Task Executor 1");
        t1.taskA();
        try {
            t1.t.join();
        } catch (InterruptedException ex) {
            //Thread.currentThread().interrupt();
            Logger.getLogger(EightInheritanceWithRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        MultiTask t2 = new MultiTask("Task Executor 2");
        t2.taskB();
    }
}
