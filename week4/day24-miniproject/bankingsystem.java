interface BankRules {
    void deposit(double amount);    // rule only
    void withdraw(double amount);   // rule only
    void showBalance();             // rule only
}
abstract class BankAccount implements BankRules{
    protected double balance;
    public BankAccount(double balance){
        this.balance= balance;
    }
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
