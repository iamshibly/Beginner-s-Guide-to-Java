class MyErrorException extends Exception {
    MyErrorException(String message) {
        super(message);
    }
}

abstract class Multiplier {
    abstract int mal(int a, int b) throws MyErrorException;
}

public class ThirteenInherit extends Multiplier {
    @Override
    int mal(int a, int b) throws MyErrorException {
        if (a < 0 || b < 0) {
            throw new MyErrorException("Negative number multiply ignore");
        }
        return a * b;
    }

    public static void main(String[] args) {
        Multiplier multiplier = new ThirteenInherit(); // Polymorphic reference

        try {
            System.out.println("Multiply is: " + multiplier.mal(5, -9));
        } catch (MyErrorException e) {
            System.out.println("Error Found");
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            System.out.println("Okay");
        }
        System.out.println("Done");
    }
}
