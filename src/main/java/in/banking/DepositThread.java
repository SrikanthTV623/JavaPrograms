package in.banking;

public class DepositThread extends Thread {

    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.deposit(amount);
        }
    }

}
