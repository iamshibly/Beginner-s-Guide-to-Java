import java.util.logging.Logger;
import java.util.logging.Level;
public class SixPriorityForBothClassAndInterface {
    public static void main(String[] args) {
        ThreadOne t=new ThreadOne("rohim");
        ThreadOne t1=new ThreadOne("korim");

        //ThreadTwo t3=new ThreadTwo(Thread.NORM_PRIORITY+5,"Rohim");
        //ThreadTwo t4=new ThreadTwo(Thread.NORM_PRIORITY,"korim");
        t.start();
        t1.start();

    }
}

class ThreadOne extends Thread{
    String s;
    ThreadOne(String s){
        this.s=s;
    }
    @Override
    public void run(){
        //System.out.println("ThreadOne");
        for(int i=0;i<10;i++){
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(s);
        }
    }
}
class threadTwo implements Runnable{
    Thread t;
    String s;
    threadTwo(int p,String s){
        this.s=s;
        t=new Thread(this);
        t.setPriority(p);
        t.start();
    }
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for(int i=0;i<6;i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(threadTwo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(s);
        }
    }
}

