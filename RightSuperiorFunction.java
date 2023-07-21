import java.util.Scanner;

public class RightSuperiorFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int count = findNumberOfSuperiorElements(arr, n);
        System.out.println(count);
    }

    public static int findNumberOfSuperiorElements(int[] arr, int n) {
        int count = 0;
        int max = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        return count + 1;
    }
}
