import java.util.Scanner;

public class SortFirstHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int half;
        if (arr.length % 2 == 0) {
            half = n / 2;
        } else {
            half = (n / 2) + 1;
        }

        for (int i = 0; i < half - 1; i++) {
            for (int j = 0; j < half - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
