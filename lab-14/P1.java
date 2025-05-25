// 1. WAP to demonstrate the builtin function of String class ( e.g. length(), charAt(), concat(), indexOf(), equals(), valueOf(), toString(), trim(), substring()) (A)

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Concatenated string: " + str.concat(" - Concatenated"));
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Is the string equal to 'Hello'? " + str.equals("Hello"));
        char[] arr = {'X', 'Y', 'Z'};
        System.out.println("String valueOf: " + String.valueOf(arr));
        System.out.println("String representation: " + str.toString());
        System.out.println("Trimmed string: '" + str.trim() + "'");
        System.out.println("Substring from index 1 to 4: " + str.substring(1, 4));
        sc.close();
    }
}
