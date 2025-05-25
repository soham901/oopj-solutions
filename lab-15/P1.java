// 1. WAP to demonstrate the builtin function of Math class ( e.g. min(), max(), random(), pow(), sqrt(), round(), ceil(), floor(), abs()) (A)

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Minimum: " + Math.min(num1, num2));
        System.out.println("Maximum: " + Math.max(num1, num2));
        System.out.println("Random number: " + Math.random());
        System.out.println("Power of " + num1 + " raised to " + num2 + ": " + Math.pow(num1, num2));
        System.out.println("Square root of " + num1 + ": " + Math.sqrt(num1));
        System.out.println("Round of " + num1 + ": " + Math.round(num1));
        System.out.println("Ceiling of " + num1 + ": " + Math.ceil(num1));
        System.out.println("Floor of " + num1 + ": " + Math.floor(num1));
        System.out.println("Absolute value of " + num1 + ": " + Math.abs(num1));
        sc.close();
    }
}
