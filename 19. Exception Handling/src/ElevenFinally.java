public class ElevenFinally {
    public static void main(String [] args){
        int a =7;
        int b=9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("The vlaue for b =" + b);
            }
            b--;
        }
    }
}
