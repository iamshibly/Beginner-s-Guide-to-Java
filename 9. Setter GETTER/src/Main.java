class A {
    private int bankProfit;  // Private field to store bank profit

    // Setter method for bankProfit
    void setBankProfit(int a) {
        bankProfit = a;
    }

    // Getter method for bankProfit
    int getBankProfit() {
        // Here you might perform an authentication check
        // For example:
        if (isAuthenticated()) {  // Assume isAuthenticated() checks user auth
            return bankProfit;
        } else {
            throw new SecurityException("Unauthorized access");
        }
    }

    // Sample authentication method (you would implement your logic here)
    private boolean isAuthenticated() {
        // Logic to verify user authentication
        return true; // Just a placeholder
    }
}
    // Main method to demonstrate usage
public class Main{
    public static void main(String[] args) {
        A a = new A();  // Create an instance of A
        a.setBankProfit(1000);  // Set bank profit
        System.out.println("Bank Profit: " + a.getBankProfit());  // Get and print bank profit
    }
}
