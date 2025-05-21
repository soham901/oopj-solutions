// 4. WAP to print addition of 2 numbers using command line (WITH Integer.parseInt()) (B)

public class P4 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
