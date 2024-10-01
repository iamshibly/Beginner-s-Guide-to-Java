package second;

import first.Two;

public class SubclassTwo extends Two {
    public void display() {
        // Accessing inherited members
        System.out.println("Accessing from subclass:");
        System.out.println("a (public): " + a); // Accessible
        System.out.println("b (protected): " + b); // Accessible
        // System.out.println("c (default): " + c); // Not accessible, will cause a compile-time error
        // System.out.println("d (private): " + d); // Not accessible, will cause a compile-time error
    }
}
