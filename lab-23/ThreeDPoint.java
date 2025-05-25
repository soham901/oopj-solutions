// 2. Create a class named ThreeDPoint to model a point in a three-dimensional
// space. Let ThreeDPoint be derived from MyPoint with following additional
// features: (B)
// -> A data fields named z that represents the z-coordinate.A no-arg
// constructor that
// creates a point (0, 0, 0).
// -> A constructor that constructs a point with three specified coordinates.
// -> A get method that returns the z value.
// -> Override the distance method to return the distance between two points in
// the threedimensional space

class MyPoint {
    protected double x;
    protected double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class ThreeDPoint extends MyPoint {
    private double z;

    public ThreeDPoint() {
        super();
        this.z = 0;
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double distance(ThreeDPoint other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        double dz = this.z - other.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double distance(double x, double y, double z) {
        double dx = this.x - x;
        double dy = this.y - y;
        double dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint(0, 0, 0);
        ThreeDPoint p2 = new ThreeDPoint(1, 2, 2);

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to (3, 4, 5): " + p1.distance(3, 4, 5));

        // P3: Create two points (0, 0, 0) and (10, 30, 25.5)
        ThreeDPoint p3 = new ThreeDPoint(0, 0, 0);
        ThreeDPoint p4 = new ThreeDPoint(10, 30, 25.5);
        System.out.println("Distance between p3 and p4: " + p3.distance(p4));
    }
}
