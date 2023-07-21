import java.util.Scanner;

public class AddingMatrixDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // row for array 1
        int n = sc.nextInt();
        // column for array 1
        int m = sc.nextInt();
        // intialize the array
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // intialize the array
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Formatted matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int matrix = a[i][j] + b[i][j];
                System.out.print(matrix + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
