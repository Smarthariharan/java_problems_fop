import java.util.Scanner;

public class MatrixMultiplicationDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] multi = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multi[i][j] = 0;

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    multi[i][j] += a[i][k] * b[k][j];
                }

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(multi[i][j] + " ");

            }
            System.out.println();

        }

        sc.close();
    }
}
