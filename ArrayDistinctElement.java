import java.util.Scanner;

public class ArrayDistinctElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        int count = n;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (a[j] == a[k]) {
                    count -= 1;
                }
            }
        }
        System.out.print(count);
    }
}
