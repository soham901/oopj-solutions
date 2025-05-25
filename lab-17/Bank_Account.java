// 3. Create a class named Bank_Account with Account_No, User_Name, Email, Account_Type and Account_Balance data members. Also create a method GetAccountDetails() and DisplayAccountDetails(). Create main method to demonstrate the Bank_Account class. (C)

import java.util.Scanner;

class Bank_Account {
    private long accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;

    public void GetAccountDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNo = sc.nextLong();

        System.out.print("Enter User Name: ");
        userName = sc.nextLine();
        sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.print("Enter Account Type (e.g., Savings/Current): ");
        accountType = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        accountBalance = sc.nextDouble();

        sc.close();
    }

    public void DisplayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: ₹" + accountBalance);
    }

    public static void main(String[] args) {
        Bank_Account account = new Bank_Account();
        account.GetAccountDetails();
        account.DisplayAccountDetails();
    }
}
