// P5. print the following pattern (C)
// * * * * *
// * *   * *
// *       *
// * *   * *
// * * * * *

public class P5 {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (
                    i == 0 || i == n - 1 ||               // Top or bottom row
                    j == 0 || j == n - 1 ||               // First or last column
                    (i == 1 && (j == 1 || j == n - 2)) || // Second row inner stars
                    (i == 3 && (j == 1 || j == n - 2))    // Fourth row inner stars
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
