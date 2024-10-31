public class FourteenInherit {
    public static void main(String []args){
        MultiplierA multiplier = new Fourteen(); // Polymorphic reference

        try {
            System.out.println("Multiply is: " + multiplier.mal(5, -9));
        } catch (MErrorException e) {
            System.out.println("Error Found");
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            System.out.println("Okay");
        }
        System.out.println("Done");
    }
}

class MErrorException extends Exception {
    MErrorException(String message) {
        super(message);
    }
}
abstract class MultiplierA {
    abstract int mal(int a, int b) throws MErrorException;
}
class Fourteen extends MultiplierA {
    @Override
    int mal(int a, int b) throws MErrorException {
        if (a < 0 || b < 0) {
            throw new MErrorException("Negative number multiply ignore");
        }
        return a * b;
    }
}