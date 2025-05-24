// 2. WAP that prompts the user to input number of calls and calculate the monthly telephone bills as per the following rule: (B)
// Minimum Rs. 200 for up to 100 calls.
// Plus Rs. 0.60 per call for next 50 calls.
// Plus Rs. 0.50 per call for next 50 calls.
// Plus Rs. 0.40 per call for any call beyond 200 calls.

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of calls: ");
        int calls = sc.nextInt();
        double bill;

        if (calls <= 100) {
            bill = 200;
        } else if (calls <= 150) {
            bill = 200 + (calls - 100) * 0.60;
        } else if (calls <= 200) {
            bill = 200 + 50 * 0.60 + (calls - 150) * 0.50;
        } else {
            bill = 200 + 50 * 0.60 + 50 * 0.50 + (calls - 200) * 0.40;
        }

        System.out.printf("The monthly telephone bill is: Rs. %.2f%n", bill);
        sc.close();
    }
}
