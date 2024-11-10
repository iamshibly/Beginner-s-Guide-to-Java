class OddThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=100; i++){
            System.out.println(Thread.currentThread().getName()+"_"+ i);
            try{
                sleep(4000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
class EvenThread extends Thread{
    @Override
    public void run() {
        for(int i=2; i<=100; i++){
            System.out.println(Thread.currentThread().getName()+"_"+ i);
            try{
                sleep(4000);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class AkThredClassSimultaneouslyAndJoin1 {
    public static void main(String[]args){
        OddThread oddThread = new OddThread();
        //EvenThread evenThread = new EvenThread();
        oddThread.setName("Odd");
        //evenThread.setName("Even");
        oddThread.start();

       // evenThread.start();
    }
}
