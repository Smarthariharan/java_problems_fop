import java.util.Scanner;

public class LCMRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int result = LCM(n, m);
        System.out.println(result);
    }

    public static int LCM(int n, int m) {
        if (n == 1 || n == 0) {
            return m;
        }
        if (m == 1 || m == 0) {
            return n;
        }
        return (n / gcd(n, m) * m);
    }

    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }
}
