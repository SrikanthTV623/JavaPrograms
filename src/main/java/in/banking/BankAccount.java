package in.banking;

public class BankAccount {

    private double balance = 0.0;

    private static final String BALANCE_MESSAGE = " Balance: ";

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + BALANCE_MESSAGE + balance);
    }

    public synchronized void withdraw(double amount) {
        System.out.println("Trying to withdraw: " + amount + BALANCE_MESSAGE + balance);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + BALANCE_MESSAGE + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }

}
