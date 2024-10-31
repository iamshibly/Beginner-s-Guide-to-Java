public class SevenCalculator {

    // Method that might throw exception
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;  // Will throw ArithmeticException if b is 0
    }

    // Approach 1: Using try-catch
    static void divideWithTryCatch() {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }

    // Approach 2: Using throws
    static void divideWithThrows() throws ArithmeticException {
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        //SevenCalculator calc = new SevenCalculator();

        // Testing try-catch approach
        System.out.println("Using try-catch:");
        //calc.divideWithTryCatch();
        SevenCalculator.divideWithTryCatch();
        // Testing throws approach
        System.out.println("\nUsing throws:");
        try {
            SevenCalculator.divideWithThrows();
            //calc.divideWithThrows();
        } catch (Exception e) {
            System.out.println("Error in main: Cannot divide by zero");
        }
    }
}