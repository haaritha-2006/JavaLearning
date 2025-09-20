import java.util.*;
public class atmsimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your balance: ");
        int balance = sc.nextInt();
        
        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        
        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("Enter amount in multiples of 100");
        } else {
            balance = balance - withdrawAmount;
            System.out.println("Transaction successful. Remaining balance = " + balance);
        }
        
        sc.close();
    }
}
