import java.util.Scanner;

public class SymmetricMatrixDD {
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
        boolean match = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Tarr[i][j] != arr[i][j]) {
                    match = false;
                }

            }
        }

        if (match == false) {
            System.out.println("Not Symmetric");
        } else {
            System.out.println("Symmetric");
        }

        sc.close();
    }
}
