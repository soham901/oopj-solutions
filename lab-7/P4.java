// 4. WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants. (B)

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        String result;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            result = "The character '" + ch + "' is a vowel";
        } else {
            result = "The character '" + ch + "' is a consonant or not a letter";
        }
        System.out.println(result);
        sc.close();
    }
}
