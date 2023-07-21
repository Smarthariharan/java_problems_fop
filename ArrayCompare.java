import java.util.Scanner;

public class ArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        boolean match = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                match = false;
                break;
            }
        }
        if (match) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();

    }
}
