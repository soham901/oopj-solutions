// 2. Perform Addition, Subtraction, Multiplication and Division of 2 numbers as per user's choice. (A)

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        double num1, num2, ans = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        if (op == '+') {
            ans = num1 + num2;
            System.out.println("The result is: " + ans);
        } else if (op == '-') {
            ans = num1 - num2;
            System.out.println("The result is: " + ans);
        } else if (op == '*') {
            ans = num1 * num2;
            System.out.println("The result is: " + ans);
        } else if (op == '/') {
            if (num2 != 0) {
                ans = num1 / num2;
                System.out.println("The result is: " + ans);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation.");
        }

        sc.close();
    }
}
