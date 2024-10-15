abstract class Animal3 {
    abstract void makeSound(); // Abstract method
}

abstract class Mammal3 extends Animal3 {
    abstract void walk(); // Another abstract method
}

class Dog3 extends Mammal3 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    void walk() {
        System.out.println("Dog walks on four legs");
    }
}

public class AbstractClasswithAbstractSubclass {
    public static void main(String[] args) {
        Dog3 dog = new Dog3(); // Creating an instance of Dog
        dog.makeSound(); // Output: Dog barks
        dog.walk(); // Output: Dog walks on four legs
    }
}
