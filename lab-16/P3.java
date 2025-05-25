// 3. WAP to demonstrate concepts of auto-boxing and unboxing using wrapper class. (C)

public class P3 {
    public static void main(String[] args) {
        // Auto-boxing: primitive to wrapper obj
        int num = 10;
        Integer obj = num;  // here it happens
        System.out.println("Auto-boxing to Integer object " + obj);

        // Unboxing: wrapper obj to primitive
        Integer obj2 = new Integer(20);
        int num2 = obj2;   // here it happens
        System.out.println("Unboxing to int " + num2);

        // auto-boxing and unboxing in arithmetic operations
        Integer a = 5;
        Integer b = 10;
        int sum = a + b; // unboxing happens here
        System.out.println("Sum of a and b: " + sum);
    }
}
