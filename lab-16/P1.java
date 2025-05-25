// 1. WAP to demonstrate concept of nested class. (A)

public class P1 {
    static class Inner {
        public void display() {
            System.out.println("This is a static nested class method.");
        }
    }

    public static void main(String[] args) {
        Inner innerObj = new Inner();
        innerObj.display();
    }
}
