public class Eight {
     int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String [] args){
        Eight ne = new Eight();

        try {
            int c = ne.divide(5,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
