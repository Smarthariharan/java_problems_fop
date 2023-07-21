import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaximumScalarProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            sum += a[i] * b[i];
        }
        System.out.println(sum);

        sc.close();
    }
}
