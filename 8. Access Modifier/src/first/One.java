
package first;

public class One {
    public static void main(String[] args) {
        Two two = new Two();
        two.print();
        System.out.println(two.a);
        System.out.println(two.b);
        System.out.println(two.c);
        // System.out.println(two.d); // This won't run because 'd' is private
    }
}

