// 3. WAP that calculates area of circle, triangle and square using method overloading. (A)

import java.util.Scanner;

public class P3 {
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double area(double base, double height) {
        return 0.5 * base * height;
    }

    static double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + area(radius));

        separator();

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + area(base, height));

        separator();

        System.out.print("Enter the side length of the square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square: " + area(side));

        sc.close();
    }

    // Optional method for better readability
    static void separator() {
        System.out.println("--------------------------------------");
    }
}
