import java.util.Scanner;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] maze = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int[][] visited = new int[N][N];
        int[] count = { 0 };

        findPaths(maze, visited, 0, 0, N, count);

        System.out.println(count[0]);
    }

    public static void findPaths(int[][] maze, int[][] visited, int x, int y, int N, int[] count) {
        if (x == N - 1 && y == N - 1) {
            count[0]++;
            return;
        }

        if (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1 && visited[x][y] == 0) {
            visited[x][y] = 1;

            findPaths(maze, visited, x, y + 1, N, count);
            findPaths(maze, visited, x, y - 1, N, count);
            findPaths(maze, visited, x - 1, y, N, count);
            findPaths(maze, visited, x + 1, y, N, count);

            visited[x][y] = 0;
        }
    }
}