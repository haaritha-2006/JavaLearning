class Bank {
    // Static variable
    static String bankName = "SuperBank";

    // Non-static variables
    String accountNumber;
    String customerName;

    // Static method
    static void displayBankName() {
        System.out.println(bankName);
    }

    // Non-static method
    void displayCustomerInfo() {
        System.out.println(customerName);
        System.out.println(accountNumber);
        System.out.println(bankName); // static accessed directly
    }
}

public class Main {
    public static void main(String[] args) {
        // Access static without object
        Bank.displayBankName();

        // Create objects for non-static members
        Bank customer1 = new Bank();
        customer1.customerName = "Alice";
        customer1.accountNumber = "A001";
        customer1.displayCustomerInfo();

        Bank customer2 = new Bank();
        customer2.customerName = "Bob";
        customer2.accountNumber = "B001";
        customer2.displayCustomerInfo();
    }
}
