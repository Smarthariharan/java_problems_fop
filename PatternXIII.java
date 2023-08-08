import java.util.Scanner;

public class PatternXIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        for (int i = 0; i <= x; i++) {
            for (int j = x - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + " ");
            }
            for (int p = i - 1; p >= 0; p--) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < x - i; k++) {
                System.out.print(k + " ");
            }
            for (int p = x - i; p >= 0; p--) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
