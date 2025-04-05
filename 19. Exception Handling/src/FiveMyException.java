import java.util.Scanner;
public class FiveMyException {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Enter the value of a : ");
        a = input.nextInt();
        if(a<0){
            try{
                throw new mExeption("less than zero");
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
class mExeption extends Exception{
    mExeption(String message){
        super(message);
    }
}