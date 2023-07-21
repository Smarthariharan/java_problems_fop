import java.util.Scanner;

public class ArrayDistinct {

    static int countDistinct(int arr[], int n) {
        int res = 1;

        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("There are " + countDistinct(arr, n) + " distinct element in the array.");
        sc.close();
    }
}
