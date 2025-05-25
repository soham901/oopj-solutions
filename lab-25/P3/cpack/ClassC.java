package cpack;

import apack.ClassA;

public class ClassC {

    public void display() {
        System.out.println("Inside ClassC (in cpack, not extending ClassA):");
        ClassA objA = new ClassA();

        System.out.println("Accessing publicVar: " + objA.publicVar);

        System.out.println("Accessing privateVar via getter: " + objA.getPrivateVar());
    }
}
