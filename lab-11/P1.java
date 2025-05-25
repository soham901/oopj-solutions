// 1. WAP to calculate simple interest using method. (A)

import java.util.Scanner;

public class P1 {
    public static double calcInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        double interest = calcInterest(principal, rate, time);
        System.out.println("Simple Interest: " + interest);
        sc.close();
    }
}
