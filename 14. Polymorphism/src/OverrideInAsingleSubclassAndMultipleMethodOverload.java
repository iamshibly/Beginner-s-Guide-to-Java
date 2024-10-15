//override and overload together
class Parent {
    void display() {
        System.out.println("Display from Parent");
    }
    void display(int a) {
        System.out.println("Display from Parent with int: " + a);
    }

}

class Child extends Parent {
    // Overriding the display() method from Parent
    @Override
    void display() {
        System.out.println("Display from Child");
    }

    // Overloading the display() method
    void display(String b) {
        System.out.println("Display from Child with String: " + b);
    }

    // Another overloaded method
    void display(int a, int b) {
        System.out.println("Display from Child with two ints: " + a + ", " + b);
    }
}

public class OverrideInAsingleSubclassAndMultipleMethodOverload {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Calls the overridden method
        child.display(5); // Calls the inherited method from Parent
        child.display("Hello"); // Calls the overloaded method
        child.display(3, 4); // Calls another overloaded method
    }
}
