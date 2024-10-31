public class NineThrowThrows {

    static double circleArea(int r) throws NegativeRadiusError{
        if(r<0){
            throw new NegativeRadiusError("Radius was entered negative");
        }
        double area = Math.PI * r *r;
        return area;
    }
    public static void main(String [] args){
        try {
            circleArea(-9);
        }
        catch(NegativeRadiusError e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }
    }
}
class NegativeRadiusError extends Exception{
    NegativeRadiusError(String message){
        super(message);
    }
}