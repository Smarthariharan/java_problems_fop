import java.util.Arrays;
import java.util.Scanner;

public class AscendingOddDescendingEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[i] = arr[i];
            } else {
                arr3[i] = arr[i];
            }
        }
        Arrays.sort(arr3);
        Arrays.sort(arr2);
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == 0) {
                continue;
            } else {
                sb.append(arr3[i] + " ");
            }

        }
        for (int i = arr2.length - 1; i > 0; i--) {
            if (arr3[i] == 0) {
                continue;
            } else {
                sb.append(arr2[i] + " ");
            }
        }

        System.out.println(sb);
    }
}
