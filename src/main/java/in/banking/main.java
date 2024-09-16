package in.banking;

public class main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        var depositThread1 = new DepositThread(account, 100);
        var depositThread2 = new DepositThread(account, 50);

        var withdrawThread1 = new WithDrawThread(account, 30);
        var withdrawThread2 = new WithDrawThread(account, 20);

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();

        // Wait for all threads to finish
        depositThread1.join();
        depositThread2.join();
        withdrawThread1.join();
        withdrawThread2.join();

        // Print the final balance
        System.out.println("Final balance: " + account.getBalance());

    }
}
