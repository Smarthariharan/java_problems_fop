import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
        sc.close();
        countingSort(inputArray);

        for (int num : inputArray) {
            System.out.print(num + " ");
        }
    }

    public static void countingSort(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] countArray = new int[max + 1];

        for (int num : arr) {
            countArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[index++] = i;
                countArray[i]--;
            }
        }
    }
}
