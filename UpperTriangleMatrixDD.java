import java.util.Scanner;

public class UpperTriangleMatrixDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int total = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] >= 1) {
                    count += 1;
                }
            }

        }
        for (int i = n; i >= 1; i--) {
            total += i;
        }

        if (count == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
