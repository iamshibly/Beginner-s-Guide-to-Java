package second;
 // Importing the Two class from package first

public class Subclass {
    public static void main(String[] args) {
        SubclassTwo subclass = new SubclassTwo();
        subclass.display();
        // Accessing members of class Two directly
        // System.out.println(subclass.c); // Not accessible
        // System.out.println(subclass.d); // Not accessible
    }
}
