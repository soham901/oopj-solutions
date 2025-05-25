// 3. Write a java program static block which will be executed before main ( ) method in a class. Also demonstrate the static method. (B)

public class P3 {
    static {
        System.out.println("Static block executed before main()");
    }

    public static void displayMessage() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        System.out.println("Inside main() method.");

        displayMessage();
    }
}
