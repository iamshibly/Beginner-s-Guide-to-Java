public class Main {
    public static void main(String [] args) {
        // declare, allocate, and initialize Box
        Box mybox1 = new Box(10.5, 2.20, 15);
        mybox1.volume();

    }
}class Box {
    double width;
    double height;
    double depth;
    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // compute and return volume
    void volume() {
        System.out.println(width*height*depth);
    }
}
