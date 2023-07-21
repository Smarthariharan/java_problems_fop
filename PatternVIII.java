import java.util.Scanner;

public class PatternVIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (j < n) {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
