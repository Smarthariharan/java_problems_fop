import java.util.Scanner;

public class ArrayElementExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        sc.close();

        try {
            System.out.println(arr[index]);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
