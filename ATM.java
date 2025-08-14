import java.util.Scanner;

public class ATM {
    private User user;
    private Scanner scanner;

    public ATM() {
        scanner = new Scanner(System.in);
        // Creating a demo user for testing
        user = new User("atharva123", "1234", 1000.0);
    }

    public void start() {
        System.out.println("Welcome to ATM");
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        if (user.authenticate(userId, pin)) {
            menu();
        } else {
            System.out.println("Invalid Credentials. Exiting...");
        }
    }

    private void menu() {
        int choice;
        do {
            System.out.println("\n1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.showTransactionHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        user.withdraw(amount);
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        user.deposit(amount);
    }

    private void transfer() {
        scanner.nextLine(); // consume newline
        System.out.print("Enter recipient User ID: ");
        String recipientId = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        user.transfer(amount, recipientId);
    }
}
