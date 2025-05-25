// 3. Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word "quit". Display the total count of each vowel for all sentences. (C)

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or type 'quit' to exit): ");
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

            System.out.println("Vowel count in this sentence:");
            System.out.println("a: " + countA);
            System.out.println("e: " + countE);
            System.out.println("i: " + countI);
            System.out.println("o: " + countO);
            System.out.println("u: " + countU);
            System.out.println("------------------------------");
        }

        System.out.println("\nTotal vowel count in all sentences:");
        System.out.println("a: " + totalA);
        System.out.println("e: " + totalE);
        System.out.println("i: " + totalI);
        System.out.println("o: " + totalO);
        System.out.println("u: " + totalU);

        sc.close();
    }
}
