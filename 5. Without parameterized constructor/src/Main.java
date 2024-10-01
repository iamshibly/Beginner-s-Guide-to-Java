public class Main {
    public static void main(String [] args) {
        // declare, allocate, and initialize Box
        Box mybox1 = new Box();
        double vol;
        vol= mybox1.volume();
        System.out.println("Volume : "+ vol);

    }
}class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = 5;
        height = 10;
        depth = 6;
    }
    // compute and return volume
    double volume() {
        return width*height*depth;
    }
}
