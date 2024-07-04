class BankAccount {
    private int accId;
    private String accHolderName;
    private double balance;
    private static int accountCount = 0;

    // Default constructor
    public BankAccount() {
        this.accId = 0;
        this.accHolderName = "";
        this.balance = 0.0;
        accountCount++;
    }

    // Parameterized constructor
    public BankAccount(int accId, String accHolderName, double balance) {
        this.accId = accId;
        this.accHolderName = accHolderName;
        this.balance = balance;
        accountCount++;
    }

    // Print account details
    public void printAccountDetails() {
        System.out.println("Account ID: " + accId);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    // Transfer money to another account
    public void transfer(BankAccount destination, double amount) {
        if (balance >= amount) {
            balance -= amount;
            destination.deposit(amount);
            System.out.println("Transfer successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient balance. Transfer failed.");
        }
    }

    // Static method to count total number of accounts created
    public static int countAccounts() {
        return accountCount;
    }
}

public class bankaccount{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1, "John Doe", 1000.0);
        BankAccount acc2 = new BankAccount(2, "Jane Smith", 500.0);

        // Testing account methods
        acc1.printAccountDetails();
        acc1.deposit(200.0);
        acc1.withdraw(100.0);

        acc2.printAccountDetails();
        acc2.deposit(300.0);
        acc2.withdraw(200.0);

        // Transfer money from acc1 to acc2
        acc1.transfer(acc2, 300.0);

        // Display total number of accounts
        System.out.println("Total number of accounts: " + BankAccount.countAccounts());
    }
}
