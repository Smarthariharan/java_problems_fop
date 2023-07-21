import java.util.Scanner;

public class SumOfEvenArrayRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int result = EvenSum(arr, n);
        System.out.println(result);

    }

    public static int EvenSum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }

        int sum = EvenSum(arr, n - 1);
        if (arr[n - 1] % 2 == 0) {
            sum += arr[n - 1];
        }
        return sum;

    }
}
