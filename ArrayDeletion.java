import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int delete = scanner.nextInt();
        scanner.close();
        
        System.out.println("Enter the number of elements in the array");
        System.out.println("Enter the elements in the array");
        System.out.println("Enter the location where you wish to delete an element");

        for (int l = 0; l < n; l++) {
            if (l == delete - 1) {
                count += 1;
            }
        }

        if (count == 0) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Array after deletion is");
        for (int j = 0; j < n; j++) {
            if (j == delete - 1) {
                continue;
            } else {
                System.out.println(a[j]);
            }
        }
    }
}
