import java.util.Scanner;

public class ManeuveringCave {

    public static int countWays(int m, int n) {
        int[][] dp = new int[m][n];

        // Fill the first row and first column with 1, as there's only one way to reach
        // cells in the first row and column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill the rest of the table using dynamic programming
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // Number of rows
        int n = sc.nextInt(); // Number of columns
        sc.close();

        int ways = countWays(m, n);
        System.out.println(ways);
    }
}
