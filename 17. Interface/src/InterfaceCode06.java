public class InterfaceCode06 {
    public static void main(String[] args) {
        Sedan4 big = new Sedan4(5, 10);
        big.start();
        big.stop();
        big.drive();    // drive() is now called
        big.accident();
        big.fuelUp();
        big.done();
    }
}

interface Vehicle4 {
    void start();
    void stop();
    void accident();
}

interface Car4 {
    int SPEED = 5;  // Constant naming convention in uppercase
    void drive();
}

abstract class AbstractCar4 implements Vehicle4, Car4 {
    int a;

    AbstractCar4(int a) {
        this.a = a;
    }

    abstract void done();
    void fuelUp() {
        System.out.println("Fueling... " + a + a);
    }
}

class Sedan4 extends AbstractCar4 {
    int b;
    Sedan4(int a, int b) {
        super(a);
        this.b = b;
    }
    @Override
    public void start() {
        System.out.println(SPEED + 5 + a);
    }
    @Override
    public void stop() {
        System.out.println("At once " + b);
    }
    @Override
    public void accident() {
        System.out.println("At twice " + b);
    }
    @Override
    public void drive() {
        System.out.println("Gone " + a + b*b);
    }
    @Override
    void done() {
        System.out.println("Gone " + a + b);
    }
}
