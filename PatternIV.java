import java.util.Scanner;

public class PatternIV {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + "");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(n + "");
            }
            System.out.println();
        }

    }
}
