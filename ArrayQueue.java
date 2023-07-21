import java.util.Scanner;

public class ArrayQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0, bus = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (sum + arr[i] > m) {
                bus++;
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }
        }
        if (sum > 0)
            bus++;
        System.out.println(bus);
        sc.close();
    }
}
