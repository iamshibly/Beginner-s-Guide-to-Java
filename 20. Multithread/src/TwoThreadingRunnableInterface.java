public class TwoThreadingRunnableInterface {
    public static void main(String[] args) {
        Thread t1=new Thread(new YourrThread("Rohim"));
        Thread t2=new Thread(new YourrThread("korim"));

        t1.start();
        //try {
        //    t1.join();
       // } catch (InterruptedException ex) {
       //     Thread.currentThread().interrupt();
        //    //Logger.getLogger(TwoThreadingRunnableInterface.class.getName()).log(Level.SEVERE, null, ex);
       // }
        t2.start();
    }
}
class YourrThread implements Runnable{
    String name;
    YourrThread(String name){
        this.name=name;
    }

    @Override
    public void run() {
        // from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for(int i=0;i<5;i++){
            System.out.println(name);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                //Logger.getLogger(YourrThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }


}
