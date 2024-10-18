public class InterfaceCode07{
    public static void main(String[] args){
    Xyz good = new Xyz();
    good.setHomeTeam("Tigers");
    good.setVisitingTeam("Lions");
    good.homeTeamScored(25);
    good.visitingTeamScored(22);
    good.endOfQuarter(2);
    good.homeGoalScored("Ronaldo");
    good.visitingGoalScored("Messi");
    good.endOfPeriod(4);
    good.overtimePeriod(1);

    }
}
interface Sports {
    void setHomeTeam(String name);
    void setVisitingTeam(String name);
}
interface Football extends Sports {
    void homeTeamScored(int points);
    void visitingTeamScored(int points);
    void endOfQuarter(int quarter);
}
interface Hockey extends Sports {
    void homeGoalScored(String goal);
    void visitingGoalScored(String goal);
    void endOfPeriod(int period);
    void overtimePeriod(int ot);
}
class Xyz implements Hockey{
    public void setHomeTeam(String name) {
    }
    public void setVisitingTeam(String name){
    }
    public void homeTeamScored(int points){
    }
    public void visitingTeamScored(int points) {
    }
    public void endOfQuarter(int quarter){
    }
    public void homeGoalScored(String goal) {
    }
    public void visitingGoalScored(String goal){
    }
    public void endOfPeriod(int period){
    }
    public void overtimePeriod(int ot){
    }
}
