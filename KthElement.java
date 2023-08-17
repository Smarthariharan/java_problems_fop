import java.util.Arrays;
import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        sc.close();
        Arrays.sort(arr);

        if (x > 0 && x <= n) {
            System.out.println(arr[n - x]);
        } else {
            System.out.println("Invalid input of K");
        }
    }
}
