public class Mid {
    public static void main(String[]args){
        if(check(2000))
            System.out.println("You are Gen z");
        else
            System.out.println("You are not Gen z");
    }
    static boolean check(int year){
        if(year>=1997&&year<2012)
            return true;
        else
            return false;
    }
}
