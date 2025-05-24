// 1. WAP to print numbers between two given numbers which is divisible by 2 but not divisible by 3. (A)

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = sc.nextInt();
        System.out.print("Enter the second number: ");
        int end = sc.nextInt();

        System.out.println("Numbers between " + start + " and " + end + " that are divisible by 2 but not by 3:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
        System.out.println();
    }
}
