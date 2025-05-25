// 3. Java String Program to Insert a string into another string. (B)

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter position to insert second string into first: ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > str1.length()) {
            System.out.println("Invalid position! Position must be between 0 and " + str1.length());
        } else {
            String result = str1.substring(0, pos) + str2 + str1.substring(pos);
            System.out.println("Resulting string: " + result);
        }

        sc.close();
    }
}
