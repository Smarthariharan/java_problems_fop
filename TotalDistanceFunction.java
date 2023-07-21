import java.util.Scanner;

public class TotalDistanceFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = TotalDistance(arr, n);
        System.out.println(result);
    }

    public static int TotalDistance(int[] arr, int n) {
        int distance = 0;
        for (int i = 0; i < n - 1; i++) {
            distance += Math.abs(arr[i] - arr[i + 1]);
        }
        return distance;
    }
}
