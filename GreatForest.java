import java.util.Scanner;

public class GreatForest {

    public static int checkCount(char[][] a, int num, int i, int j) {
        if (i < 0 || i >= num || j < 0 || j >= num || a[i][j] == 'W') {
            return 0;
        }

        int innerCount = 1;
        a[i][j] = 'W';

        innerCount += checkCount(a, num, i + 1, j);
        innerCount += checkCount(a, num, i - 1, j);
        innerCount += checkCount(a, num, i, j + 1);
        innerCount += checkCount(a, num, i, j - 1);

        return innerCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                a[i][j] = s.charAt(j);
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 'T') {
                    int forest = checkCount(a, n, i, j);
                    if (forest > max) {
                        max = forest;
                    }
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}