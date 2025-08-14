import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String pin;
    private Account account;
    private List<Transaction> transactions;

    public User(String userId, String pin, double initialBalance) {
        this.userId = userId;
        this.pin = pin;
        this.account = new Account(initialBalance);
        this.transactions = new ArrayList<>();
    }

    public boolean authenticate(String userId, String pin) {
        return this.userId.equals(userId) && this.pin.equals(pin);
    }

    public void showTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawal successful. Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        transactions.add(new Transaction("Deposit", amount));
        System.out.println("Deposit successful. Balance: " + account.getBalance());
    }

    public void transfer(double amount, String recipientId) {
        if (account.withdraw(amount)) {
            transactions.add(new Transaction("Transfer to " + recipientId, amount));
            System.out.println("Transferred " + amount + " to " + recipientId + ". Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}
