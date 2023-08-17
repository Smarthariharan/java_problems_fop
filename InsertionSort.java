import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        s.close();
        for (int y = 0; y < a.length; y++)
            System.out.print(a[y] + " ");

        // int x, i;
        // for (int j = 1; j < n; j++) {
        // x = a[j];
        // i = j - 1;
        // while (i >= 0 && x <= a[i]) {
        // a[i + 1] = a[i];
        // i--;
        // }
        // a[i + 1] = x;
        // }

    }
}
