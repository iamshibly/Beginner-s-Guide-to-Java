import java.util.Scanner;

public class FiveMyExecption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        System.out.println("Enter the value of a: ");
        userInput = scanner.nextInt();

        if (userInput < 0) {
            try {
                throw new NegativeValueException("Value is less than zero");
            } catch (Exception e) {
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

class NegativeValueException extends Exception {
    NegativeValueException(String message) {
        super(message);
    }
}
