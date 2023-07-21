import java.util.Scanner;

public class DiagonalMatrixDifferenceDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        int leftDiagonal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    leftDiagonal += a[i][j];
                }

            }

        }
        int rightDiagonal = 0;
        for (int i = 0; i < n; i++) {

            rightDiagonal += a[i][n - i - 1];

        }

        int difference = leftDiagonal - rightDiagonal;
        System.out.println(Math.abs(difference));

        sc.close();
    }
}
