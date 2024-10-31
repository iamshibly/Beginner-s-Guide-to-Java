import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        int [] marks = new int[3];
        int number = 0;
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        try{
            System.out.println(1/5);
            try{
                System.out.println("The value at array index entered is: " + marks[ind]);
                System.out.println("The division is: " + marks[ind]/number);
            }
                catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception handled in level 02");
                    System.out.println("ArrayIndexOutOfBoundsException Occured!");
                    System.out.println(e);
                }
        }
        catch(Exception e){
            System.out.println("Exception handled in level 01");
            System.out.println(e);
        }
        System.out.println("DONE");
    }
}
