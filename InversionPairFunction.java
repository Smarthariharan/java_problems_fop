import java.util.*;

public class InversionPairFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int result = CountInversionPair(arr, n);
        System.out.println(result);
    }

    public static int CountInversionPair(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }

            }
        }

        return count;
    }
}
