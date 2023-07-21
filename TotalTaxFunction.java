import java.util.Scanner;

public class TotalTaxFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = TotalTaxAmount(arr, n);
        System.out.println(result);
    }

    public static int TotalTaxAmount(int[] arr, int n) {
        int totalTax = 0;
        for (int i = 0; i < n; i++) {
            int taxableAmount = Math.max(arr[i] - 1000, 0);
            totalTax += (int) (0.1 * taxableAmount);
        }
        return totalTax;
    }
}
