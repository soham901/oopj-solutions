// 3. Three sides of a triangle are entered through the keyboard. WAP to check whether the triangle is isosceles, equilateral, scalene or right-angled triangle. (C)

// Classification:
// Equilateral: All three sides are equal.
// Isosceles: Any two sides are equal.
// Scalene: All three sides are different.
// Right-angled: Applies the Pythagorean Theorem and checks all permutations due to side ordering.


import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Sides must be positive numbers.");
            sc.close();
            return;
        }

        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("The given sides do not form a valid triangle.");
            sc.close();
            return;
        }

        if (a == b && b == c) {
            System.out.println("The triangle is equilateral.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }

        double a2 = a * a, b2 = b * b, c2 = c * c;
        if (Math.abs(a2 + b2 - c2) < 1e-6 || Math.abs(b2 + c2 - a2) < 1e-6 || Math.abs(c2 + a2 - b2) < 1e-6) {
            System.out.println("The triangle is also right-angled.");
        }

        sc.close();
    }
}
