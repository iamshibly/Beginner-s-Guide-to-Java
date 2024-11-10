import java.util.logging.Level;
import java.util.logging.Logger;
public class FiveMultithreadWithPriority {

    public static void main(String[] args) {
        new RohimThread(Thread.NORM_PRIORITY+5,"Rohim");
        RohimThread t2=new RohimThread(Thread.NORM_PRIORITY-2,"Korim");
    }
}
class RohimThread implements Runnable{
    Thread t;
    String s;
    RohimThread(int a,String s){
        this.s=s;
        t=new Thread(this);
        t.setPriority(a);
        t.start();
    }
    @Override
    public void run() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("interface");
        for(int i=0;i<=6;i++){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RohimThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(s);
        }
    }
}
