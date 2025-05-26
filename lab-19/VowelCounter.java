// 3. Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word "quit". Display the total count of each vowel for all sentences. (C)

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

            for (char ch : input.toLowerCase().toCharArray()) {
                switch (ch) {
                    case 'a': countA++; totalA++; break;
                    case 'e': countE++; totalE++; break;
                    case 'i': countI++; totalI++; break;
                    case 'o': countO++; totalO++; break;
                    case 'u': countU++; totalU++; break;
                }
            }

            System.out.printf("This sentence - a:%d e:%d i:%d o:%d u:%d\n", countA, countE, countI, countO, countU);
        }

        System.out.printf("\nTotal - a:%d e:%d i:%d o:%d u:%d\n", totalA, totalE, totalI, totalO, totalU);
        sc.close();
    }
}
