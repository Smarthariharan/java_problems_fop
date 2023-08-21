import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int inversionPairs = countInversionPairs(arr);
        System.out.println(inversionPairs);
    }

    public static int countInversionPairs(int[] arr) {
        if (arr == null) {
            return -1;
        }

        int n = arr.length;
        if (n < 2) {
            return 0;
        }

        int inversionCount = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                if (arr[j] > arr[k]) {
                    inversionCount++;
                }
            }
        }

        return inversionCount;
    }
}
