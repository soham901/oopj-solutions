// 2. Java String Program to Print even length words. (B)

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");

        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Even length words are:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
        sc.close();
    }
}
