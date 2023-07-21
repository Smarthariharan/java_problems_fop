import java.util.*;

public class EvenOddSwap {
    public static void main(String[] args) {
        int[] arr = { 10, 98, 3, 33, 12, 22, 21, 11 };
        int n = 8;
        int temp = 0;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            while (arr[l] % 2 == 0 && l < r) {
                l++;

            }
            while (arr[r] % 2 == 1 && l < r) {
                r--;
            }

            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

        }
        System.out.print(Arrays.toString(arr) + " ");

    }
}
