import java.util.Arrays;
import java.util.Scanner;

public class MaxMinFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int result = AddMaxMin(arr);
        System.out.println(result);

    }

    public static int AddMaxMin(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = arr[0];
        int max = arr[n - 1];
        int sum = min + max;

        return sum;
    }
}
