import java.util.Scanner;
public class AiExceptionPractise {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a==0) {
            try {
                throw new MyException("Can not divide by zero");
            }
            catch(MyException e){
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println("Error Handled");
            }
        }
        else{
            System.out.println("Result: " + 10/a);
        }
    }
}
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}