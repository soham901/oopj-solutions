// 3. Write a program in Java to swap 2 values taken from user without using 3rd variable (B)

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}
