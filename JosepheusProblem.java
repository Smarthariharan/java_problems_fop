import java.util.Scanner;

public class JosepheusProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(findSafePosition(n, k) + 1);
    }

    public static int findSafePosition(int n, int k) {
        if (n == 1)
            return 0;
        else
            // return (findSafePosition(n - 1, k) + k - 1) % n + 1;
            return (findSafePosition(n - 1, k) + k) % n;
    }
}
