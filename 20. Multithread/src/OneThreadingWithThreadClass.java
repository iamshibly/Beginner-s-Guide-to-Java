//import java.util.logging.Level;
//import java.util.logging.Logger;

public class OneThreadingWithThreadClass {

    public static void main(String[] args) {
        MyThread t1=new MyThread("Rohim");
        MyThread t2=new MyThread("korim");
        //MyThread t3=new MyThread("Jorim");

        t1.start();
        try {
           t1.join();
        } catch (InterruptedException ex) {
           Thread.currentThread().interrupt();
            //Logger.getLogger(OneThreadingWithThreadClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        //t3.start();
    }
}
class MyThread extends Thread{
    String name;
    MyThread(String name){
        this.name=name;

    }
    @Override
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println(name);

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                //Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
