public class InterfaceCode05 {
    public static void main(String[] args) {
        Sedan3 big = new Sedan3(5);
        big.start();
        big.stop();
        big.accident();
        big.fuelUp();
        big.done();
    }
}

interface Vehicle3 {
    void start();
    void stop();
    void accident();
}

interface Car3 {
    int SPEED = 5;  // Constant naming convention in uppercase
    void drive();
}

abstract class AbstractCar3 implements Vehicle3, Car3 {
    int a;

    AbstractCar3(int a) {
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
    @Override
    public void start() {
        System.out.println("Speed: " + SPEED * 4);
    }
    @Override
    public void stop() {
        System.out.println("Speed: " + SPEED * 10);
    }
}
class Sedan3 extends AbstractCar3{
    Sedan3(int a){
        super(a);
    }

    @Override
    void done() {
        System.out.println(a);
    }
}


