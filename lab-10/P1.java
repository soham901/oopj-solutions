// P1. print the following pattern (A)
//     @
//    # #
//   @ @ @
//  # # # #
// @ @ @ @ @


public class P1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("@ ");
                }
            }

            System.out.println();
        }
    }
}
