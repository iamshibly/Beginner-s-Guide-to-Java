abstract class Animal1 {
    // Overloaded abstract methods
    abstract void sound(); // Abstract method with no parameters

    // Overloaded method with a string parameter
    abstract void sound(String type);
}

class Dog1 extends Animal1 {
    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
    void sound(int a) {
        System.out.println("Dog barks like a " + a + ".");
    }

    // Overloading the sound method in Dog class
    @Override
    void sound(String type) {
        System.out.println("Dog barks like a " + type + ".");
    }
}

class Cat1 extends Animal1 {
    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }

    // Overloading the sound method in Cat class
    @Override
    void sound(String type) {
        System.out.println("Cat meows like a " + type + ".");
    }
    void sound(String a, String b) {
        System.out.println("Dog barks like a " + a + "." + b);
    }
}

public class AbstractOverridenOverload{
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.sound(); // Calls the no-parameter version
        dog.sound(6); // Calls the overloaded version

        Cat1 cat = new Cat1();
        cat.sound(); // Calls the no-parameter version
        cat.sound("lion","cat"); // Calls the overloaded version
    }
}
