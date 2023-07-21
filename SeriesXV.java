import java.util.Scanner;

public class SeriesXV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        arr[0] = 3;
        arr[1] = 8;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + i;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
