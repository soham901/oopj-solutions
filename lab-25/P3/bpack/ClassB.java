package bpack;

import apack.ClassA;

public class ClassB extends ClassA {

    public void display() {
        System.out.println("Inside ClassB (in bpack, extends ClassA):");

        System.out.println("Accessing protectedVar: " + protectedVar);

        System.out.println("Accessing publicVar: " + publicVar);

        System.out.println("Accessing privateVar via getter: " + getPrivateVar());
    }
}
