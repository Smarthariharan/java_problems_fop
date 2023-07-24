import java.util.*;

public class TriangleExceptionHandling {
    static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int base = obj.nextInt();
        int hori = obj.nextInt();
        double ans = 0;
        obj.close();

        try {
            ans = (fact(base) / (double) fact(base - 1)) * (fact(hori) / (fact(hori - 2) * 2.0));
        } catch (Exception e) {
            System.out.print("Divide by zero");
        } finally {
            System.out.println((int) ans);
        }
    }
}
