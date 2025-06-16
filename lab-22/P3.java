// 3. Demonstrate the use of Final Keyword to prevent function overriding, variable modification and extraction of a class in sub class. (B)

public class P3 {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.show();
        System.out.println("Final variable MAX_VALUE = " + f.MAX_VALUE);
    }
}

final class FinalClass {
    final int MAX_VALUE = 100;

    final void show() {
        System.out.println("This is a final method.");
    }
}
