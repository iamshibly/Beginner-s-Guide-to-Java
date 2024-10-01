class Circle {
    double x,y,r;
    // Constructor
    Circle (double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    //Methods to return circumference and area
    double circumference() { return 2*3.14*r;}
    double area() { return 3.14 * r * r; }
}
public class Main{
    public static void main(String[]args){
        Circle c= new Circle(2,3,6);
        System.out.println(c.area());
        System.out.println(c.circumference());

    }
}