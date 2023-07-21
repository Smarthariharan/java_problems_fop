import java.util.Scanner;

public class MaxArrayElementRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = findMaxElement(arr, n);
        System.out.println("Maximum element in the array is " + max);
    }

    public static int findMaxElement(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int max = findMaxElement(arr, n - 1);
        if (arr[n - 1] > max) {
            return arr[n - 1];
        } else {
            return max;
        }
    }

}
