// 2. WAP to print the largest number from the three given number using Math class function. (B)

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int largest = Math.max(num1, Math.max(num2, num3));

        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
