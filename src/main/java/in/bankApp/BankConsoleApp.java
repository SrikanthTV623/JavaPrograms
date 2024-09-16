package in.bankApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankConsoleApp {
    public static HashMap<String, Double> accountDetails = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                // complete the implementation here and call below given function repectively
                case 1:
                    String an = scanner.nextLine();
                    System.out.println(getAccountBalance(an));
                    break;

                case 2:
                    String source = scanner.nextLine();
                    String dest = scanner.nextLine();
                    double amount = scanner.nextDouble();
                    System.out.println(performFundTransfer(source,dest,amount));
                    break;

                case 3:
                    System.out.println(convertToLowerCase(scanner.next()));
                    break;

                case 4:
                    System.out.println(convertToUpperCase(scanner.next()));
            }

        } while (choice != 5);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Account Balance Inquiry");
        System.out.println("2. Fund Transfer");
        System.out.println("3. Convert Account Details to Upper Case");
        System.out.println("4. Convert Account Details to Lower Case");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static double getAccountBalance(String accountNumber) {
        // retrun account balance.
        // return 0.0 if account not found
        if(accountDetails.containsKey(accountNumber)){
            return accountDetails.get(accountNumber);
        }
        return 0.0;
    }

    public static boolean performFundTransfer(String sourceAccount, String destinationAccount, double amount) {
        // perform fund transfer
        if(accountDetails.containsKey(sourceAccount) &&
                accountDetails.containsKey(destinationAccount) &&
                accountDetails.get(sourceAccount)>=amount)
        {
            accountDetails.put(destinationAccount,accountDetails.get(destinationAccount)+amount);
            accountDetails.put(sourceAccount,accountDetails.get(sourceAccount)-amount);
            return true;
        }
        return false;
    }

    public static String convertToUpperCase(String accountDetailsInput) {
        // convert to upper case
        return accountDetailsInput.toUpperCase();
    }

    public static String convertToLowerCase(String accountDetailsInputToLower) {
        // convert to lower case
        return accountDetailsInputToLower.toLowerCase();
    }
}
