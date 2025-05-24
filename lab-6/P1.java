// 1. WAP that reads a number in meters, converts it to feet, and displays the result. (A)

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;

        System.out.printf("%.2f meters is equal to %.2f feet.%n", meters, feet);

        scanner.close();
    }
}
