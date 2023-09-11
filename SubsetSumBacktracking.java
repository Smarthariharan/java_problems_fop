import java.util.Scanner;

public class SubsetSumBacktracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        if (hasSubsetWithSum(arr, sum)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean hasSubsetWithSum(int[] arr, int sum) {
        return hasSubsetWithSumUtil(arr, 0, sum);
    }

    static boolean hasSubsetWithSumUtil(int[] arr, int index, int sum) {
        if (index >= arr.length) {
            return sum == 0;
        }

        if (hasSubsetWithSumUtil(arr, index + 1, sum - arr[index])) {
            return true;
        }

        return hasSubsetWithSumUtil(arr, index + 1, sum);
    }
}
