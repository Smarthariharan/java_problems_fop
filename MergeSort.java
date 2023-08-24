import java.util.Scanner;

public class MergeSort {

    public static void merge(int arr[], int l, int m, int r) {
        int[] b = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            b[k] = arr[i];
            i++;
            k++;
        }
        while (j <= r) {
            b[k] = arr[j];
            j++;
            k++;
        }
        for (i = l, k = 0; i <= r; i++, k++) {
            arr[i] = b[k];
        }
    }

    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        sort(arr, 0, n - 1);
        printArray(arr);
    }
}