// 2. WAP to print the score card of cricket match using the two dimensional array. Take all the input regarding score card from the user. (B)

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of overs: ");
        int overs = sc.nextInt();

        int[][] scoreCard = new int[players][overs];

        for (int i = 0; i < players; i++) {
            System.out.println("Enter runs for Player " + (i + 1) + ":");
            for (int j = 0; j < overs; j++) {
                System.out.print("  Over " + (j + 1) + ": ");
                scoreCard[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nCricket Score Card:");
        System.out.print("Player\\Over\t");
        for (int j = 0; j < overs; j++) {
            System.out.print("O" + (j + 1) + "\t");
        }
        System.out.println("Total");

        for (int i = 0; i < players; i++) {
            int total = 0;
            System.out.print("Player " + (i + 1) + "\t");
            for (int j = 0; j < overs; j++) {
                System.out.print(scoreCard[i][j] + "\t");
                total += scoreCard[i][j];
            }
            System.out.println(total);
        }

        sc.close();
    }
}
