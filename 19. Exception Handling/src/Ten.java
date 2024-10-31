public class Ten {
    static int mal(int a,int b) throws NegativeMultisErrorException{
        if(a<0 || b<0){
            throw new NegativeMultisErrorException("Negative number multiply ignore");
            }
            return a*b;
    }
    public static void main(String [] args){

        try {
            System.out.println("Multiply is: " + mal(5,-9));
        }
        catch (NegativeMultisErrorException e){
            System.out.println("Error Found");
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        finally {
            System.out.println("Okay");
        }
        System.out.println("Done");
    }
}

class NegativeMultisErrorException extends Exception{
    NegativeMultisErrorException(String message){
        super(message);
    }
}