import java.util.Scanner;

public class Lastnonzero {

    public static int lastNonZeroDigit(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            while (result % 10 == 0) {
                result /= 10;
            }
            result %= 1000000; // Keep only the last 6 digits
        }
        return result % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int lastDigit = lastNonZeroDigit(n);
            System.out.println(lastDigit);
        }
        sc.close();
    }
}
