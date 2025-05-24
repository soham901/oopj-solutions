// 5. WAP to find out largest number from given three numbers without using Logical Operator.(C)

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int largest = a;
        largest = (b > largest) ? b : largest;
        largest = (c > largest) ? c : largest;
        System.out.println("Largest number is: " + largest);
        sc.close();
    }
}
