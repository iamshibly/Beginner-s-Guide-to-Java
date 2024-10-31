import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index: ");
            int ind = sc.nextInt();
            try {
                System.out.println(marks[ind]);
                System.out.println("Good");
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
