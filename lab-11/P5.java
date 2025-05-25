// 5. Write a method with following method header: public int gcd (int num1, int num2).
// Write a program that prompts the user to enter two integers and compute the gcd of two integers. [Note: The greatest common divisor (GCD) of two numbers is the largest number that divides them both.] (B)

import java.util.Scanner;

public class P5 {
    public static int gcd(int num1, int num2) {
        // Euclidean Algorithm
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);

        sc.close();
    }
}
