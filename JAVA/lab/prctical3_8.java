class JointAccount {
    private double balance;

    public JointAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(String Holder, double amount) {
        synchronized (this) {
            System.out.println(Holder + " is depositing :" + amount);
            balance += amount;
            System.out.println("New balance after deposit:" + balance);
        }
    }
    
    // The synchronized keyword is used to ensure that only one thread at a time can
    // access and modify the balance within the JointAccount class.

    // It prevents race conditions and data corruption by creating a lock on the
    // JointAccount object, allowing only one thread to execute the deposit or
    // withdraw methods at any given time.

    // This synchronization ensures that account operations are performed
    // atomically, maintaining data integrity and preventing inconsistencies when
    // multiple threads interact with the same account.

    public void withdraw(String Holder, double amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(Holder + " is withdrawing:" + amount);
                balance -= amount;
                System.out.println("New balance after withdrawing :" + balance);
            } else {
                System.out.println(Holder + " tried to withdraw " + amount + " but there's not enough balance.");
            }
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class prctical3_8 {
    public static void main(String[] args) {
        JointAccount account = new JointAccount(899.0);

        Thread accountHolder1 = new Thread(() -> {
            account.deposit("shiv", 320.0);
            account.withdraw("shiv", 250.0);
        });

        Thread accountHolder2 = new Thread(() -> {
            account.deposit("Akhil", 560.0);
            account.withdraw("Akhil", 550.0);
        });

        accountHolder1.start();
        accountHolder2.start();

        try {
            accountHolder1.join();
            accountHolder2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance in the joint account: " + account.getBalance());
    }
}
