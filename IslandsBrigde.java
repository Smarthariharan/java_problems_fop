import java.util.*;

class IslandBrigde {
    static void island(int[][] a, int n, int m, int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m || a[i][j] == 0)
            return;
        a[i][j] = 0;
        island(a, n, m, i - 1, j - 1);
        island(a, n, m, i - 1, j);
        island(a, n, m, i - 1, j + 1);
        island(a, n, m, i, j - 1);
        island(a, n, m, i, j + 1);
        island(a, n, m, i + 1, j - 1);
        island(a, n, m, i + 1, j);
        island(a, n, m, i + 1, j + 1);
    }

    static int bridges(int[][] a, int n, int m) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    count++;
                    island(a, n, m, i, j);
                }
            }
        }
        if (count == 0)
            return 0;
        return count - 1;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = s.nextInt();
        System.out.print(bridges(a, n, m));
        s.close();
    }

}