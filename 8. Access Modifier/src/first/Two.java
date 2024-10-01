package first;

public class Two {  // Make the class public
    public int a = 5;
    protected int b = 20;
    int c = 11;  // Default access
    private int d = 100;

    public void print() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d+"\n");
    }
}