import java.util.Scanner;

public class BankSystemArray {
    static final int MAX_USERS = 100;
    static String[] usernames = new String[MAX_USERS];
    static String[] passwords = new String[MAX_USERS];
    static double[] balances = new double[MAX_USERS];
    static int userCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int loggedInUser = -1;

        do {
            System.out.println("\n=== CLI BANK SYSTEM ===");
            System.out.println("1. Register User");
            System.out.println("2. Login User");
            if (loggedInUser != -1) {
                System.out.println("3. Deposit Money");
                System.out.println("4. Withdraw Money");
                System.out.println("5. Show Balance");
                System.out.println("6. Logout");
            }
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerUser(sc);
                    break;
                case 2:
                    loggedInUser = loginUser(sc);
                    break;
                case 3:
                    if (loggedInUser != -1)
                        deposit(sc, loggedInUser);
                    else
                        System.out.println("Please login first.");
                    break;
                case 4:
                    if (loggedInUser != -1)
                        withdraw(sc, loggedInUser);
                    else
                        System.out.println("Please login first.");
                    break;
                case 5:
                    if (loggedInUser != -1)
                        showBalance(loggedInUser);
                    else
                        System.out.println("Please login first.");
                    break;
                case 6:
                    if (loggedInUser != -1) {
                        System.out.println("Logged out successfully.");
                        loggedInUser = -1;
                    } else {
                        System.out.println("You are not logged in.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    static void registerUser(Scanner sc) {
        if (userCount >= MAX_USERS) {
            System.out.println("User limit reached.");
            return;
        }
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        usernames[userCount] = username.trim();
        passwords[userCount] = password.trim();
        balances[userCount] = 0.0;

        System.out.println("Registration successful.");
        userCount++;
    }

    static int loginUser(Scanner sc) {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                System.out.println("Login successful. Welcome, " + username + "!");
                return i;
            }
        }
        System.out.println("Login failed.");
        return -1;
    }

    static void deposit(Scanner sc, int userIndex) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        balances[userIndex] += amount;
        System.out.println("Deposit successful.");
    }

    static void withdraw(Scanner sc, int userIndex) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }
        if (amount > balances[userIndex]) {
            System.out.println("Insufficient funds.");
            return;
        }
        balances[userIndex] -= amount;
        System.out.println("Withdrawal successful.");
    }

    static void showBalance(int userIndex) {
        System.out.println("Current balance: " + balances[userIndex]);
    }
}
