import java.util.*;

public class ArrayRangeElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int max;
        int min;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        max = a[0];
        for (int j = 0; j < n; j++) {

            if (max < a[j]) {
                max = a[j];
            }
        }
        min = a[0];
        for (int k = 0; k < n; k++) {

            if (min > a[k]) {
                min = a[k];
            }

        }

        System.out.println("Enter the number of elements in the array");
        System.out.println("Enter the elements in the array");
        System.out.println("The range of the array is " + (max - min));

    }
}
