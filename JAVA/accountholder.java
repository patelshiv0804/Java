 class BankAccount {
    private int accId;
    private String accHolderName;
    private double balance;
    private static int totalAccounts = 0;

    // Default constructor
    public BankAccount() {
        totalAccounts++;
    }

    // Parameterized constructor
    public BankAccount(int accId, String accHolderName, double balance) {
        this.accId = accId;
        this.accHolderName = accHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    // Instance method to print account details
    public void printAccountDetails() {
        System.out.println("Account ID: " + accId);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Instance method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    // Instance method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }

    // Instance method to transfer money to another account
    public void transfer(BankAccount destination, double amount) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount);
            destination.deposit(amount);
            System.out.println("$" + amount + " transferred successfully to " + destination.accHolderName + ".");
        } else {
            System.out.println("Transfer failed. Insufficient funds or invalid amount.");
        }
    }

    // Static method to count total number of accounts created
    public static int countAccounts() {
        return totalAccounts;
    }
}

public class accountholder {
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount(1, "John Doe", 1000.0);
        BankAccount account2 = new BankAccount(2, "Jane Smith", 500.0);

        // Print initial account details
        System.out.println("Initial Account Details:");
        account1.printAccountDetails();
        account2.printAccountDetails();

        // Perform transactions
        account1.withdraw(200.0);
        account1.deposit(300.0);
        account1.transfer(account2, 150.0);

        // Print updated account details
        System.out.println("\nUpdated Account Details:");
        account1.printAccountDetails();
        account2.printAccountDetails();

        // Count the total number of accounts
        System.out.println("\nTotal number of accounts: " + BankAccount.countAccounts());
    }
}
