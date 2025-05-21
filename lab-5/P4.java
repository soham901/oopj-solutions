// 4. Write a program to find compound interest. All the necessary input will be given by the user. (C)

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal, rate, time, and number of times interest applied per year
        System.out.print("Enter Principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (r) in %: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time in years (t): ");
        double time = sc.nextDouble();

        System.out.print("Enter Number of times interest applied per year (n): ");
        int n = sc.nextInt();

        // Calculate Compound Interest
        double amount = principal * Math.pow((1 + (rate / 100) / n), n * time);
        double compoundInterest = amount - principal;

        // Output
        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
        System.out.printf("Total Amount: %.2f\n", amount);

        sc.close();
    }
}
