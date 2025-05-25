package package1;

public class A {
    private int privateVar = 1;
    public int publicVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4;

    public void display() {
        System.out.println("Inside class A:");
        System.out.println("privateVar = " + privateVar);
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
    }
}
