import java.util.logging.Level;
import java.util.logging.Logger;

class YourThread implements Runnable{
    Thread t;
    String name;
    YourThread(String name){
        this.name=name;
        t=new Thread(this);
    }
    @Override
    public void run() {
        // from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for(int i=0;i<5;i++){
            System.out.println(name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                //Thread.currentThread().interrupt();
                Logger.getLogger(YourThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
public class ThreeMultithreadButNotMultiTask {
    public static void main(String[] args) {
        YourThread t1=new YourThread("Rohim");
        YourThread t2=new YourThread("korim");
        t1.t.start();
        try {
            t1.t.join();
        } catch (InterruptedException ex) {
            //Thread.currentThread().interrupt();
            Logger.getLogger(ThreeMultithreadButNotMultiTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.t.start();
    }
}