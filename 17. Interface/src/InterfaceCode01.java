public class InterfaceCode01 {
    public static void main(String[]args){
        Science ob= new Biology();
        ob.firstSem();
        ob.secondSem();
        System.out.println("Biology is: " + Science.itIs);

    }
}
interface Science{
    String itIs = "Hard";
    void firstSem();
    void secondSem();
}
class Biology implements Science{
    public void firstSem(){
        System.out.println("Joss");
    }
    public void secondSem(){
        System.out.println("tose");
    }
}