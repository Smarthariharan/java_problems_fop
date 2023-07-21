import java.util.Scanner;

public class PatternVI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            int numCount = 2 * i - 1;
            for (int j = 1; j <= numCount; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
