import java.util.Scanner;

public class ArrayInsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count++;
        }
        int index = sc.nextInt();
        int element = sc.nextInt();

        if (count != n) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] == index) {
                    arr[i] = element;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
