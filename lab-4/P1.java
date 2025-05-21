// 1. WAP to print addition of 3 numbers (with Scanner). (A)

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
