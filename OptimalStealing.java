import java.util.Scanner;

public class OptimalStealing {
    public static int maxStolenValue(int[] houseValue) {
        int n = houseValue.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return houseValue[0];
        }

        int[] dp = new int[n];
        dp[0] = houseValue[0];
        dp[1] = Math.max(houseValue[0], houseValue[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + houseValue[i]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] houseValue = new int[N];

        for (int i = 0; i < N; i++) {
            houseValue[i] = scanner.nextInt();
        }

        int result = maxStolenValue(houseValue);
        System.out.println(result);

        scanner.close();
    }
}
