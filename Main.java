import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankEmployee1 bankEmployee = new BankEmployee1();
        Transaction1 transaction = new Transaction1();
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Bank Employee Operations");
            System.out.println("2. User Transaction Operations");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    bankEmployee.run();
                    break;
                case 2:
                    transaction.run();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
        
        System.out.println("Exiting...");
        scanner.close();
    }
}

class BankEmployee1 {
    Scanner scanner;
    List<String> accounts;

    public BankEmployee1() {
        scanner = new Scanner(System.in);
        accounts = new ArrayList<>();
    }

    public void openNewAccount() {
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        accounts.add(name);
        System.out.println("Account opened successfully for " + name);
    }

    public void deleteAccount() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts to delete.");
            return;
        }

        System.out.println("Enter customer name to delete account:");
        String name = scanner.nextLine();
        if (accounts.remove(name)) {
            System.out.println("Account deleted successfully for " + name);
        } else {
            System.out.println("Account not found for " + name);
        }
    }

    public void openExistingData() {
        if (accounts.isEmpty()) {
            System.out.println("No existing data.");
            return;
        }

        System.out.println("Existing data:");
        for (String account : accounts) {
            System.out.println(account);
        }
    }

    public void registerAtmAgency() {
        System.out.println("Registering at ATM agency...");
        // Add your logic here if needed
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nBank Employee Operations:");
            System.out.println("1. Open New Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Open Existing Data");
            System.out.println("4. Register ATM Agency");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    openNewAccount();
                    break;
                case 2:
                    deleteAccount();
                    break;
                case 3:
                    openExistingData();
                    break;
                case 4:
                    registerAtmAgency();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}

class Transaction1 {
    private Scanner scanner;
    private double balance;

    public Transaction1() {
        scanner = new Scanner(System.in);
        balance = 0.0; // Initialize balance to zero
    }

    public void do_transaction() {
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        if (amount > 0) {
            balance += amount;
            System.out.println("Transaction successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount. Transaction failed.");
        }
    }

    public void cancel_transaction() {
        System.out.println("Enter amount to withdraw:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction cancelled. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Transaction failed.");
        }
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nTransaction Operations:");
            System.out.println("1. Do Transaction");
            System.out.println("2. Cancel Transaction");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    do_transaction();
                    break;
                case 2:
                    cancel_transaction();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}
