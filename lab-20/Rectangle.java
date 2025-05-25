// 4. Create a class "Rectangle" that would contain length and width as an instance variable and count as a static variable. Define constructors [constructor overloading (default, parameterized and copy)] to initialize variables of objects. Define methods to find area and to display variables value of objects which are created. [Note: define initializer block, static initializer block and the static variable and method. Also demonstrate the sequence of execution of initializer block and static initialize block] (C)

public class Rectangle {
    private double length;
    private double width;
    private static int count;

    static {
        System.out.println("Static initializer block executed.");
        count = 0;
    }

    {
        System.out.println("Instance initializer block executed.");
    }

    public Rectangle() {
        System.out.println("Default constructor called.");
        this.length = 1.0;
        this.width = 1.0;
        count++;
    }

    public Rectangle(double length, double width) {
        System.out.println("Parameterized constructor called.");
        this.length = length;
        this.width = width;
        count++;
    }

    public Rectangle(Rectangle other) {
        System.out.println("Copy constructor called.");
        this.length = other.length;
        this.width = other.width;
        count++;
    }

    public double area() {
        return length * width;
    }

    public void display() {
        System.out.println("Length = " + length + ", Width = " + width);
    }

    public static void displayCount() {
        System.out.println("Total Rectangle objects created: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        Rectangle r1 = new Rectangle();
        r1.display();
        System.out.println("Area: " + r1.area());

        Rectangle r2 = new Rectangle(5.0, 3.0);
        r2.display();
        System.out.println("Area: " + r2.area());

        Rectangle r3 = new Rectangle(r2);
        r3.display();
        System.out.println("Area: " + r3.area());

        Rectangle.displayCount();

        System.out.println("Main method ended.");
    }
}
