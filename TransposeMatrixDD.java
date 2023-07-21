import java.util.Scanner;

public class TransposeMatrixDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int[][] Tarr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Tarr[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpose Matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Tarr[i][j] + " ");

            }
            System.out.println();
        }

        sc.close();
    }
}
