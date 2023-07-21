import java.util.Scanner;

public class ArrayDuplicateElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        boolean[] check = new boolean[num];

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] == arr[j]) {
                    check[j] = true;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            if (!check[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}
