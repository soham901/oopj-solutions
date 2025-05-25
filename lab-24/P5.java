// 5. Implement the structure of hybrid inheritance using class and interface in java. (C)

interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

class D {
    void methodD() {
        System.out.println("Method of class D");
    }
}

class E extends D implements C {
    @Override
    public void methodA() {
        System.out.println("Implementation of methodA from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Implementation of methodB from interface B");
    }

    @Override
    public void methodC() {
        System.out.println("Implementation of methodC from interface C");
    }
}

public class P5 {
    public static void main(String[] args) {
        E obj = new E();

        obj.methodD();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
