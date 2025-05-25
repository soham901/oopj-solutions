// P6. print the following pattern (C)
// * * * * *
// *       *
// *       *
// *       *
// * * * * *

public class P6 {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (
                    i == 0 || i == n - 1 ||               // Top or bottom row
                    j == 0 || j == n - 1               // First or last column
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
