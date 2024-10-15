class Mammal2 {
    void sleep() {
        System.out.println("Mammal is sleeping.");
    }
}

abstract class Animal2 extends Mammal2 {
    abstract void makeSound();
}

class Dog2 extends Animal2 {
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractBasic2 {
    public static void main(String[] args) {
        Mammal2 mammal = new Mammal2(); // This is valid, as Mammal is a concrete class
        mammal.sleep(); // Output: Mammal is sleeping.

        Dog2 dog = new Dog2(); // This is also valid
        dog.makeSound(); // Output: Dog barks.
    }
}
