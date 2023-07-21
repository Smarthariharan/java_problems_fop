import java.util.Scanner;

public class ArrayElementDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        if (n < index) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Array after deletion is:");
        for (int i = 0; i < index - 1; i++) {
            System.out.println(arr[i]);
        }
        for (int i = index; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
