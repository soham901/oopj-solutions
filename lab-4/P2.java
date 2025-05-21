// 2. WAP to find a diameter from given area of circle. (A)

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter area : ");
        double area = scanner.nextDouble();

        double radius = Math.sqrt(area / Math.PI);
        double diameter = 2 * radius;

        System.out.printf("%.2f\n", diameter);

        scanner.close();
    }
}
