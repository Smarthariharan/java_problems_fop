import java.util.Arrays;
import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] v1 = createArray(scanner, n);
        int[] v2 = createArray(scanner, n);

        int minScalarProduct = minScalar(v1, v2, n);

        System.out.println(minScalarProduct);
    }

    public static int[] createArray(Scanner scanner, int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int minScalar(int[] v1, int[] v2, int n) {
        ascending(v1, n);
        descending(v2, n);

        int minScalarProduct = 0;
        for (int i = 0; i < n; i++) {
            minScalarProduct += v1[i] * v2[i];
        }

        return minScalarProduct;
    }

    public static void ascending(int[] array, int n) {
        Arrays.sort(array);
    }

    public static void descending(int[] array, int n) {
        Arrays.sort(array);
        reverse(array, n);
    }

    public static void reverse(int[] array, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

}
