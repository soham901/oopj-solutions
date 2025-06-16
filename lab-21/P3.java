// 3. WAP for implementing single inheritance which creates one class account_details for getting account information and another class interest for calculating and displaying total interest from the data inserted from account details. (C)

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Interest acc = new Interest();
        acc.getAccountInfo();
        acc.calculateAndDisplayInterest();
    }
}

class AccountDetails {
    protected double principal;
    protected double rate;
    protected double time;

    public void getAccountInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = sc.nextDouble();

        sc.close();
    }
}

class Interest extends AccountDetails {

    public void calculateAndDisplayInterest() {
        double interest = (principal * rate * time) / 100;
        System.out.println("Total Interest: " + interest);
    }
}
