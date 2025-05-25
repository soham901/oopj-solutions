// 2. Create a class named shape. In this class, we have three subclasses circle, triangle and square. WAP to display area of all three classes. (B)

import java.util.Scanner;

class Shape {
    void displayArea() {
        System.out.println("Area calculation for shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void displayArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    void displayArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the Circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);

        System.out.print("Enter base of the Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of the Triangle: ");
        double height = sc.nextDouble();
        Triangle triangle = new Triangle(base, height);

        System.out.print("Enter side of the Square: ");
        double side = sc.nextDouble();
        Square square = new Square(side);

        System.out.println();
        circle.displayArea();
        triangle.displayArea();
        square.displayArea();

        sc.close();
    }
}
