import java.util.Scanner;

// Custom checked exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method declares it might throw InsufficientBalanceException
    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw negative amount!"); // unchecked
        }
        if(amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!"); // checked
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(5000);

        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        try {
            acc.withdraw(amt); // call method
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed."); // always executes
            sc.close();
        }
    }
}
