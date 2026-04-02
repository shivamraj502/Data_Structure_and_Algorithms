package day0_4;
/**
 * Create a class BankAccount with private fields: accountNumber, balance. Provide 
 * deposit(double), withdraw(double), getBalance(). 
 * In main, create account, deposit, withdraw, print balance.
 */

public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber , double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Deposit amount must be positive.");
        }
        return balance;
    }

    public double withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance -= amount;
        }
        return balance;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String args[]){
        BankAccount account = new BankAccount("123456", 1000.0);
        System.out.println("account no.: " + account.accountNumber + ", initial balance: " + account.getBalance());
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
