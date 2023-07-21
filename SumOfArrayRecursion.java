import java.util.Scanner;

public class SumOfArrayRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = SumOfArray(arr, n);
        System.out.println("The sum of the elements in the array is " + result);
    }

    public static int SumOfArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return arr[n - 1] + SumOfArray(arr, n - 1);
    }
}
