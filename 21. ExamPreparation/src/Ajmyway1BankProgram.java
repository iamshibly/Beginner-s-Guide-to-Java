class IinsufficientFundsException extends Exception{
    IinsufficientFundsException(String message){
        super(message);
    }
}
class BBankAccount{
    int bankBalance;
    BBankAccount(int bankBalance){
        this.bankBalance= bankBalance;
    }
    void withdraw(int withdrawalAmount) throws IinsufficientFundsException{
        if(bankBalance<withdrawalAmount){
            throw new IinsufficientFundsException("Insufficient Funds! Your Balance is : " + bankBalance);
        }
        bankBalance -= withdrawalAmount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: "+ bankBalance);
    }
}
public class Ajmyway1BankProgram {
    public static void main(String[]args){
        BBankAccount account = new BBankAccount(500);
        try{
            System.out.println("Attempting to withdraw 300");
            account.withdraw(300);
            System.out.println("Attempting to withdraw 400");
            account.withdraw(400);
        }
        catch(IinsufficientFundsException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
