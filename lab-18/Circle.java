// 3. WAP to create Circle class with area and perimeter function to find area and perimeter of circle. (C)

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        Circle circle = new Circle(r);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Perimeter of Circle: " + circle.perimeter());

        sc.close();
    }
}
