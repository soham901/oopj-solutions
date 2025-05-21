// 2. Write a program in Java to find area and perimeter of a square and rectangle. (A)

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the square: ");
        double side = sc.nextDouble();

        double squareArea = side * side;
        double squarePerimeter = 4 * side;

        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);

        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double rectArea = length * breadth;
        double rectPerimeter = 2 * (length + breadth);

        System.out.println("Rectangle Area: " + rectArea);
        System.out.println("Rectangle Perimeter: " + rectPerimeter);

        sc.close();
    }
}
