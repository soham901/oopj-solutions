package package2;

import package1.A;

public class B extends A {
    public void testAccess() {
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
    }

    public static void main(String[] args) {
        A objA = new A();
        System.out.println("Access from instance of A in another package:");
        System.out.println("publicVar = " + objA.publicVar);

        System.out.println("\nAccess from subclass B:");
        B objB = new B();
        objB.testAccess();
    }
}
