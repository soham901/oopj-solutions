// 7. WAP to find the factorial of given number using recursion. (C)

import java.util.Scanner;

public class P7 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        sc.close();
    }
}
