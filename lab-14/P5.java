// 5. Java String Program to Set Characters to a String and get that character from that string. (C)

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the index of the character to set: ");
        int index = sc.nextInt();
        System.out.print("Enter the character to set: ");
        char newChar = sc.next().charAt(0);
        if (index < 0 || index >= input.length()) {
            System.out.println("Index out of bounds.");
        } else {
            StringBuilder sb = new StringBuilder(input);
            sb.setCharAt(index, newChar);
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
