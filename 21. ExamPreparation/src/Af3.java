public class Af3 {
    public static void main(String[] args) {
        try {
            // Call a method that may throw an exception
            divide(10, 2);
        } catch (ArithmeticException e) {
            // Catch the specific exception
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("An Exception occurred: " + e.getMessage());
        }
    }

    public static void divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator > 0) {
            // Throw an ArithmeticException if the denominator is zero
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }
}