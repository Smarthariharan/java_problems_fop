import java.util.Scanner;

public class PatternIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i * 2 - 1; j <= n * 2 - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }

        sc.close();
    }
}
