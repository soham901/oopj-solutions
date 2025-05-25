// P3. print the following pattern (B)
//       5
//      aa
//     543
//    bbbb
//   54321

public class P3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Odd rows: print decreasing numbers
            if (i % 2 != 0) {
                for (int j = n; j >= n - i + 1; j--) {
                    System.out.print(j);
                }
            } else { // Even rows: print letters
                char ch = 'a';
                if (i == 4) ch = 'b';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                }
            }

            System.out.println();
        }
    }
}
