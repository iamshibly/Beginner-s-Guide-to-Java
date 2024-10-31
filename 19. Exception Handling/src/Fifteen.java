// Custom exception class
class MyrrorException extends Exception {
    MyrrorException(String message) {
        super(message);
    }
}

// Abstract Multiplier class
abstract class MultiplierB {
    int a, b;

    // Constructor to initialize variables
    MultiplierB(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Abstract method to be implemented by subclasses
    abstract int mal() throws MyrrorException;
}

// Single class handling multiplication with an optional check
class PositiveMultiplier extends MultiplierB {
    PositiveMultiplier(int a, int b) {
        super(a, b);
    }

    @Override
    int mal() throws MyrrorException {
        if (a < 0 || b < 0) {
            throw new MyrrorException("Negative number multiply ignored");
        }
        return a * b;
    }
}

// Main class to test the functionality
public class Fifteen {
    public static void main(String[] args) {
        MultiplierB multiplier = new PositiveMultiplier(5, -9);

        try {
            System.out.println("Result: " + multiplier.mal());
        } catch (MyrrorException e) {
            System.out.println("Error Found");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Okay");
        }
        System.out.println("Done");
    }
}
