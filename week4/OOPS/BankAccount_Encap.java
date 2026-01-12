class BankAccount_Encap {
    // private variables
    private String accountNumber;
    private double balance;

    // Constructor (optional)
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance); // use setter for validation
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Method to deposit
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Create two accounts
        BankAccount_Encap acc1 = new BankAccount_Encap("A001", 5000);
        BankAccount_Encap acc2 = new BankAccount_Encap("A002", 2000);

        // Test deposit and withdraw
        acc1.deposit(1500);
        acc1.withdraw(2000);

        acc2.deposit(500);
        acc2.withdraw(3000); // should show error

        // Print account details
        System.out.println("Account 1: " + acc1.getAccountNumber() + ", Balance: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getAccountNumber() + ", Balance: " + acc2.getBalance());
    }
}
