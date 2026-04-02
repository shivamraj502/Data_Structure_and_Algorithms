package day0_4;
public class MainAccount {
    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2("12345", 1000);
        
        System.out.println("=== DEMONSTRATING PRIVATE FIELD ACCESS ===");
        
        // ========================
        // SECTION 1: WRONG WAY - DIRECT ACCESS
        // ========================
        System.out.println("\n1. Trying to access PRIVATE fields directly:");
        
        // UNCOMMENT THESE LINES TO SEE RED ERROR LINES IN VS CODE:
        /*
        System.out.println("Trying to get accountNumber: " + account.accountNumber);  // ERROR!
        System.out.println("Trying to get balance: " + account.balance);              // ERROR!
        
        System.out.println("Trying to change accountNumber directly...");
        account.accountNumber = "99999";  // ERROR!
        
        System.out.println("Trying to change balance directly...");
        account.balance = 5000;           // ERROR!
        */
        
        System.out.println("RESULT: All above lines show COMPILER ERRORS!");
        System.out.println("Error message: 'accountNumber has private access in BankAccount2'");
        System.out.println("Error message: 'balance has private access in BankAccount2'");
        
        // ========================
        // SECTION 2: CORRECT WAY - USING GETTERS/SETTERS
        // ========================
        System.out.println("\n2. Correct way - Using GETTERS and SETTERS:");
        
        // USING GETTERS - WORKS PERFECTLY!
        System.out.println("Account via getter: " + account.getAccountNumber());
        System.out.println("Balance via getter: " + account.getBalance());
        
        // USING SETTER - WORKS PERFECTLY!
        account.setAccountNumber("67890");
        System.out.println("Account after setter: " + account.getAccountNumber());
        
        // Using controlled methods
        account.deposit(500);
        account.withdraw(200);
        
        System.out.println("\nFinal Account: " + account.getAccountNumber());
        System.out.println("Final Balance: " + account.getBalance());
    }
}