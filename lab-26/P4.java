// 4. WAP to create Account class, which is representing a bank account where we can deposit and withdraw money.if we want to withdraw money which exceed our bank balance?We will not be allowed,create a customize exception to handle above situation and display proper error message.(C)

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed: Insufficient balance! Available: ₹" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class P4 {
    public static void main(String[] args) {
        Account account = new Account(5000);

        System.out.println("Initial Balance: ₹" + account.getBalance());

        account.deposit(2000);

        try {
            account.withdraw(8000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
