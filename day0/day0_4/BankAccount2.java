package day0_4;
class BankAccount2 {
    private String accountNumber;  // PRIVATE - cannot access directly
    private double balance;        // PRIVATE - cannot access directly
    
    public BankAccount2(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // GETTER for accountNumber - This is the CORRECT way to access private field
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // SETTER for accountNumber - This is the CORRECT way to modify private field
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty()) {
            this.accountNumber = accountNumber;
        }
    }
    
    // GETTER for balance - This is the CORRECT way to access private field
    public double getBalance() {
        return balance;
    }
    
    // No direct setter for balance - control through deposit/withdraw only
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}