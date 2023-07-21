import java.util.Scanner;

public class PatternI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
