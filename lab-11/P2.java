// 2. WAP to find maximum number from given three numbers using method. (A)

import java.util.Scanner;

public class P2 {
    public static int findMax(int a, int b, int c) {
        // Same logic that we have used in lab-7/P5.java
        int largest = a;
        largest = (b > largest) ? b : largest;
        largest = (c > largest) ? c : largest;
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
        sc.close();
    }
}
