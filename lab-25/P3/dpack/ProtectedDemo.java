package dpack;

import bpack.ClassB;
import cpack.ClassC;

public class ProtectedDemo {
    public static void main(String[] args) {
        System.out.println("Inside ProtectedDemo (in dpack):");

        ClassB objB = new ClassB();
        objB.display();

        System.out.println();

        ClassC objC = new ClassC();
        objC.display();
    }
}
