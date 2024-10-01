package third;

import first.Two;  // Importing the public class Two from package first

public class OutsidePackage {
    public static void main(String[] args) {
        Two two = new Two();  // Create an instance of the public class Two
        System.out.println("Accessing public variable a: " + two.a);  // Accessible
        // System.out.println("Accessing protected variable b: " + two.b); // Not accessible; compile-time error
        // System.out.println("Accessing default variable c: " + two.c);   // Not accessible; compile-time error
        // System.out.println("Accessing private variable d: " + two.d);    // Not accessible; compile-time error

        two.print();  // Call the print method to see all member variables
    }
}