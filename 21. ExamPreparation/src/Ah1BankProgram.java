class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Your balance is: $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: $" + balance);
    }
}
public class Ah1BankProgram {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            System.out.println("Attempting to withdraw $300");
            account.withdraw(300);

            System.out.println("\nAttempting to withdraw $300");
            account.withdraw(300);
        }
        catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}