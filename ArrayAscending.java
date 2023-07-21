import java.util.Scanner;

public class ArrayAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n - j - 1; k++) {
                if (a[k] > a[k + 1]) {
                    int temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int c = 0; c < n; c++) {
            System.out.println(a[c]);
        }
    }
}
