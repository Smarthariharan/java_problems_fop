import java.util.Scanner;

public class BitDifference {
    static int sumBitDifferences(int arr[], int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {

            int count = 0;
            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) != 0)
                    count++;

            ans += (count * (n - count) * 2);
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(sumBitDifferences(arr, n));
    }
}
