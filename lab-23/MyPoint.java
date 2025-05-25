// 1. Design a class named MyPoint to represent a point with x- and
// y-coordinates.
// The class contains: The data fields x and y that represent the coordinates
// with getter methods. (A)
// -> a no-arg constructor that creates a point (0, 0).
// -> a constructor that constructs a point with specified coordinates.
// -> a method named distance that returns the distance from this point to a
// specified point of the MyPoint type.
// -> a method named distance that returns the distance from this point to
// another point with specified x- and y-coordinates.

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(MyPoint other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to (6, 8): " + p1.distance(6, 8));
    }
}
