public class InterfaceCode04 {
    public static void main(String[] args) {
        Sedan big = new Sedan(5, 10);
        big.start();
        big.stop();
        big.drive();    // drive() is now called
        big.accident();
        big.fuelUp();
        big.done();
    }
}

interface Vehicle2 {
    void start();
    void stop();
    void accident();
}

interface Car2 {
    int SPEED = 5;  // Constant naming convention in uppercase
    void drive();
}

abstract class AbstractCar implements Vehicle2, Car2 {
    int a;

    AbstractCar(int a) {
        this.a = a;
    }

    abstract void done();

    void fuelUp() {
        System.out.println("Fueling... " + a + a);
    }

    @Override
    public void accident() {
        System.out.println("Speed: " + SPEED * 2);
    }

    @Override
    public void drive() {
        System.out.println("Speed: " + SPEED);
    }
}

class Sedan extends AbstractCar {
    int b;

    Sedan(int a, int b) {
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
    void done() {
        System.out.println("Gone " + a + b);
    }
}
