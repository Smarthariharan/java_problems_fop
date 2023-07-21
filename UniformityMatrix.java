import java.util.Scanner;

public class UniformityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        int EvenCount = 0;
        int OddCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 == 0) {
                    EvenCount++;
                } else {
                    OddCount++;
                }

            }

        }
        if (EvenCount == (n * n) || OddCount == (n * n)) {
            System.out.println("Yes");

        } else {
            System.out.println("No ");
        }

        sc.close();
    }
}
