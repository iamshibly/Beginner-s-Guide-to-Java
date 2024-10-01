class Manager{
    private int bankB;
    void setB(int bankB){
        //we can do authentication here
        this.bankB= bankB;
    }
    int getB(){
        return bankB;
    }
}
public class checkB{
    public static void main(String[]args) {
        Manager m = new Manager();
        m.setB(100000);
        int a= m.getB();
        System.out.println(a);

    }
}