import java.util.Scanner;

public class RatMazeMultipleJumps {

    public static boolean solveMaze(int[][] maze, int x, int y, int n, int[][] solution) {
        if (x == n - 1 && y == n - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (x < 0 || y < 0 || x >= n || y >= n || maze[x][y] == 0 || solution[x][y] == 1) {
            return false;
        }

        solution[x][y] = 1;

        for (int i = 1; i <= maze[x][y]; i++) {
            if (y + i < n && solveMaze(maze, x, y + i, n, solution)) {
                return true;
            }
            if (x + i < n && solveMaze(maze, x + i, y, n, solution)) {
                return true;
            }
        }

        solution[x][y] = 0;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int[][] maze = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    maze[i][j] = sc.nextInt();
                }
            }
            sc.close();
            int[][] solution = new int[n][n];
            boolean isPossible = solveMaze(maze, 0, 0, n, solution);

            if (isPossible) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(solution[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("-1");
            }
        }
    }
}
