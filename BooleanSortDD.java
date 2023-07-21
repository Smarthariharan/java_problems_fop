import java.util.Scanner;

public class BooleanSortDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        int MaxOnes = 0;
        int MaxOneIndex = 0;
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    ones++;
                }
            }
            if (ones > MaxOnes) {
                MaxOnes = ones;
                MaxOneIndex = i;

            }

        }
        System.out.println(MaxOneIndex);

        sc.close();
    }
}
