// 1. Demonstrate the built-in types of exception using example. (A)

public class P1 {
    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            arr[5] = 10; // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // 3. NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            String num = "abc";
            int n = Integer.parseInt(num); // Not a number
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        System.out.println("Program executed successfully.");
    }
}
