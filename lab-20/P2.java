// 2. Check whether this can access the Static variables of the class or not.(A)

public class P2 {
    static int x = 10;
    int y = 50;

    public void display() {
        System.out.println("Instance y: " + this.y);

        System.out.println("Static a accessed using class name: " + P2.x);
        System.out.println("Static a accessed directly: " + x);
    }

    public static void main(String[] args) {
        P2 obj = new P2();
        obj.display();
    }
}
