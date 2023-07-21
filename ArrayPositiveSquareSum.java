import java.util.Scanner;

public class ArrayPositiveSquareSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (Math.sqrt(arr[i]) == Math.floor(Math.sqrt(arr[i]))) {
                sum += arr[i];
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
