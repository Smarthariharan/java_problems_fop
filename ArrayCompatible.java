import java.util.Scanner;

public class ArrayCompatible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        if (n != m) {
            System.out.println("Incompatible");
            return;

        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            if (arr1[i] < arr2[i]) {
                System.out.println("Incompatible");
                return;

            }
        }
        System.out.println("Compatible");

    }
}
