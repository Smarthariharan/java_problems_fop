import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        int rsum = 0;
        int csum = 0;
        int rowSum = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                rsum += arr[i][j];

            }
            rowSum = rsum;
            rsum = 0;
        }

        int colSum = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                csum += arr[j][i];

            }
            colSum = csum;
            csum = 0;

        }

        int diaSum = 0;
        for (int i = 0; i < n; i++) {
            diaSum += arr[i][i];
        }

        if (rowSum == colSum && colSum == diaSum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
