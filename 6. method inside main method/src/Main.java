/*public class Main {
    public static void main(String[] args) {
        abc();
        abc();
    }
    static void abc(){
        System.out.println("klk kopamu");
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        int answer1= abc(5,10);
        System.out.println(answer1);
        int answer2=abc(10,20);
        System.out.println(answer2);
    }
    static int abc(int a, int b){
        return a+b;
    }
}*/
/*public class Main {
    public static void main(String[] args){
        if(check(2030)){
            System.out.println("You are a GenZ");
        }
        else{
            System.out.println("You are not GenZ");
        }

    }
    static boolean check(int year){
        if(year<=2012 && year>=1997)
            return true;
        else
            return false;
    }
}*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        float marks = input.nextFloat();

        System.out.println("Grade: " + grade(marks));
    }

    static String grade(float n) {
        if (n <= 100 && n >= 80)
            return "A+";
        else if (n < 80 && n >= 70)
            return "A";
        else if (n < 70 && n >= 60)
            return "B";
        else if (n < 60 && n >= 50)
            return "C";
        else if (n < 50 && n >= 40)
            return "D";
        else if (n < 40 && n >= 0)
            return "F";
        else
            return "Please enter a valid mark!";
    }
}
