public class Main {
    public static void main(String[] args) {
        Actor details = new Actor();
        details.age=23;
        details.name ="Jhon Wick";
        System.out.println(details.name + "'s age is " + details.age + " &" + details.acting());


        Director details2 = new Director();
        details2.awards="IFFA";
        details2.numberOfFilms= 7;
        System.out.print(details2.awards + " is own by Dua for " +details2.numberOfFilms +"films & has box office of ");
        details2.boxOffice();

    }
}
class Actor{
    String name;
    int age;
    String acting(){
        return " Deserves Oscar";
    }
}
class Director{
    String awards;
    int numberOfFilms;
    void boxOffice(){
        System.out.println("One Billion USD");
    }
}