// 1. WAP to make a Simple Calculator using switch...case. (A)

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        double num1, num2, ans = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                sc.close();
                return;
        }

        System.out.println("The result is: " + ans);
        sc.close();
    }
}
