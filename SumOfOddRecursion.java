import java.util.Scanner;

public class SumOfOddRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = sumOfPositiveOddNumbers(arr, 0);
        System.out.println("Sum =" + sum);
    }

    public static int sumOfPositiveOddNumbers(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return 0;
        }

        int currentNumber = arr[index];
        if (currentNumber > 0 && currentNumber % 2 != 0) {
            return currentNumber + sumOfPositiveOddNumbers(arr, index + 1);
        } else {
            return sumOfPositiveOddNumbers(arr, index + 1);
        }
    }
}
