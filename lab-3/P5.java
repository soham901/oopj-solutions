// 5. Three sides of a triangle are entered through the keyboard. WAP to check whether the triangle is isosceles, equilateral, scalene or right-angled triangle (C)

// https://qph.cf2.quoracdn.net/main-qimg-ebabd8e573a448a743eb98a4c4c26cf7-pjlq

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sides of the triangle
        System.out.print("Enter side a: ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        // Check if the sides form a valid triangle
        if (a + b > c && b + c > a && c + a > b) {
            // Equilateral
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            }
            // Isosceles
            else if (a == b || b == c || c == a) {
                System.out.println("Isosceles Triangle");
            }
            // Scalene
            else {
                System.out.println("Scalene Triangle");
            }

            // Check for right-angled triangle using Pythagoras theorem
            int a2 = a * a, b2 = b * b, c2 = c * c;
            if (a2 + b2 == c2 || b2 + c2 == a2 || c2 + a2 == b2) {
                System.out.println("Right-Angled Triangle");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

        sc.close();
    }
}
