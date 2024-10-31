import java.util.Scanner;
public class FourMyException {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Enter the value of a : ");
        a = input.nextInt();
        if(a<0){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Good");

            }
        }
        System.out.println("Job");
    }
}
class MyException extends Exception{
    @Override
    public String toString(){
    return "toString Method";
    }
    @Override
    public String getMessage(){
    return "getMessage Method";
   }
}